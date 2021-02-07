package com.ywh.shopping.shoppingcommonaouth.annotation;

import com.ywh.shopping.shoppingcommonaouth.config.WebSecurityConfiguration;
import org.springframework.context.annotation.Import;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author : yanwenhui
 * @description :
 * @date : 2021/1/12
 */
@Target({ ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@Import({WebSecurityConfiguration.class})
public @interface EnableServiceWebSecurity {
}
