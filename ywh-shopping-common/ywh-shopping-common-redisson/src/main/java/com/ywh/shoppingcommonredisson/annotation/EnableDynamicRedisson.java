package com.ywh.shoppingcommonredisson.annotation;

import com.ywh.shoppingcommonredisson.config.RedissionImportBeanDefinitionRegistrar;
import com.ywh.shoppingcommonredisson.config.RedissonAutoConfiguration;
import com.ywh.shoppingcommonredisson.config.RedissonDynamicAutoConfiguration;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @author : yanwenhui
 * @description :
 * @date : 2020/11/24
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import({RedissonAutoConfiguration.class, RedissonDynamicAutoConfiguration.class})
public @interface EnableDynamicRedisson {
}
