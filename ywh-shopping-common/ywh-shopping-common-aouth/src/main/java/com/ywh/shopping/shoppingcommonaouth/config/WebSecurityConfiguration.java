package com.ywh.shopping.shoppingcommonaouth.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.DefaultAuthenticationEventPublisher;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @author : yanwenhui
 * @description :
 * @date : 2021/1/12
 */
@Configuration
@ConditionalOnClass(DefaultAuthenticationEventPublisher.class)
@EnableWebSecurity
public class WebSecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Override
    public void configure(WebSecurity web) {
        web.ignoring().antMatchers(
                "/**/actuator/**",
                "/**/swagger-ui/**",
                // swagger api json
                "/**/v2/api-docs",
                // 用来获取支持的动作
                "/**/swagger-resources/configuration/ui",
                // 用来获取api-docs的URI
                "/**/swagger-resources",
                // 安全选项
                "/**/swagger-resources/configuration/security",
                "/**/swagger-resources/**",
                //补充路径，近期在搭建swagger接口文档时，通过浏览器控制台发现该/webjars路径下的文件被拦截，故加上此过滤条件即可。(2020-10-23)
                "/**/webjars/**");
    }
}
