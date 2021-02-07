package com.ywh.shoppinggatewayweb.authorize.filter;

import com.ywh.shoppinggatewayweb.authorize.util.WhiteApiUtils;
import org.apache.commons.lang3.StringUtils;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.core.io.buffer.DataBufferFactory;
import org.springframework.core.io.buffer.DataBufferUtils;
import org.springframework.http.HttpCookie;
import org.springframework.http.HttpStatus;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.http.server.reactive.ServerHttpResponse;
import org.springframework.http.server.reactive.ServerHttpResponseDecorator;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.nio.charset.Charset;

/**
 * @author : yanwenhui
 * @description :
 * @date : 2020/12/23
 */
//@Component
public class AuthorizeFilter implements GlobalFilter, Ordered {
    private static final String AUTHORIZE_TOKEN = "Authorization";

    private static final String loginURL = "http://localhost:9001/oauth/login";

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {

        // 1.获取请求对象
        ServerHttpRequest request = exchange.getRequest();
        // 2.获取响应对象
        ServerHttpResponse response = exchange.getResponse();

        // 3.放行白名单
        if (WhiteApiUtils.isWhiteApi(request.getURI().toString())) {
            return chain.filter(exchange);
        }

        // 4.判断 是否为登录的URL 如果不是权限校验
        // 4.1 从头header中获取令牌数据
        String token = request.getHeaders().getFirst(AUTHORIZE_TOKEN);
        if (StringUtils.isEmpty(token)) {
            // 4.2 从cookie中中获取令牌数据
            HttpCookie first = request.getCookies().getFirst(AUTHORIZE_TOKEN);
            if (first != null) {
                // 就是令牌的数据
                token = first.getValue();
            }
        }
        if (StringUtils.isEmpty(token)) {
            //4.3 从请求参数中获取令牌数据
            token = request.getQueryParams().getFirst(AUTHORIZE_TOKEN);
        }

        if (StringUtils.isEmpty(token)) {
            //4.4. 如果没有数据,没有登录,要重定向到登录到页面
//            response.setStatusCode(HttpStatus.SEE_OTHER);
            //location 指定的就是路径 -- 302/303
//            response.getHeaders().set("Location", loginURL + "?From=" + request.getURI().toString());

            response.setStatusCode(HttpStatus.UNAUTHORIZED);
            return response.setComplete();
        }

        token = token.replace("Bearer ", "");

//        //5 解析令牌数据 ( 判断解析是否正确,正确 就放行 ,否则 结束)
//        try {
//
//            Claims claims = JwtUtils.parseJWT(token);
//            String subject = claims.getSubject();
//
//        } catch (Exception e) {
//            e.printStackTrace();
//            //解析失败
//            response.setStatusCode(HttpStatus.UNAUTHORIZED);
//            return response.setComplete();
//        }

        //添加头信息 传递给 各个微服务()
        request.mutate().header(AUTHORIZE_TOKEN, "Bearer " + token);

        return chain.filter(exchange);
    }

    @Override
    public int getOrder() {
        return 0;
    }
}
