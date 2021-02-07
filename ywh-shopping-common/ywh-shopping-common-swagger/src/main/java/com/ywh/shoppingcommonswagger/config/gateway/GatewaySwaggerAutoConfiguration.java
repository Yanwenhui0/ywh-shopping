package com.ywh.shoppingcommonswagger.config.gateway;

import com.ywh.shoppingcommonswagger.config.gateway.support.SwaggerResourceHandler;
import com.ywh.shoppingcommonswagger.config.gateway.support.SwaggerSecurityHandler;
import com.ywh.shoppingcommonswagger.config.gateway.support.SwaggerUiHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.cloud.gateway.config.GatewayProperties;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import springfox.documentation.swagger.web.SecurityConfiguration;
import springfox.documentation.swagger.web.SwaggerResourcesProvider;
import springfox.documentation.swagger.web.UiConfiguration;

/**
 * @author yanwenhui
 * @date 2020/12/21
 * <p>
 * 网关swagger 配置类，仅在webflux 环境生效哦
 */
@Configuration
@ConditionalOnWebApplication(type = ConditionalOnWebApplication.Type.REACTIVE)
@ConditionalOnProperty(name = "swagger.gateway.enabled", havingValue = "true")
public class GatewaySwaggerAutoConfiguration {

	@Bean
	public WebFluxSwaggerConfiguration fluxSwaggerConfiguration() {
		return new WebFluxSwaggerConfiguration();
	}

	@Bean
	@Primary
	public MySwaggerResourceProvider getSwaggerResourceProvider(final RouteLocator routeLocator,
																final GatewayProperties gatewayProperties) {
		return new MySwaggerResourceProvider(routeLocator, gatewayProperties);
	}

//	@Bean
//	public SwaggerResourceController getSwaggerResourceController(MySwaggerResourceProvider swaggerResourceProvider) {
//		return new SwaggerResourceController(swaggerResourceProvider);
//	}

	@Bean
	public RouterFunction swaggerRouterFunction(final SwaggerResourcesProvider swaggerResources,
												final @Autowired(required = false) SecurityConfiguration securityConfiguration,
												final @Autowired(required = false)UiConfiguration uiConfiguration) {
		return RouterFunctions
				.route(RequestPredicates.GET("/swagger-resources").and(RequestPredicates.accept(MediaType.ALL)),
						new SwaggerResourceHandler(swaggerResources))
				.andRoute(RequestPredicates.GET("/swagger-resources/configuration/ui")
						.and(RequestPredicates.accept(MediaType.ALL)), new SwaggerUiHandler(uiConfiguration))
				.andRoute(RequestPredicates.GET("/swagger-resources/configuration/security")
						.and(RequestPredicates.accept(MediaType.ALL)), new SwaggerSecurityHandler(securityConfiguration));
	}


}
