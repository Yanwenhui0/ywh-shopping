//package com.ywh.shoppinggatewayweb.swagger.config;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.cloud.gateway.config.GatewayProperties;
//import org.springframework.cloud.gateway.route.RouteLocator;
//import org.springframework.cloud.gateway.support.NameUtils;
//import org.springframework.context.annotation.Primary;
//import org.springframework.stereotype.Component;
//import springfox.documentation.swagger.web.SwaggerResource;
//import springfox.documentation.swagger.web.SwaggerResourcesProvider;
//
//import java.util.ArrayList;
//import java.util.List;
//
///**
// * @author : yanwenhui
// * @description : 聚合各个服务的swagger接口
// * @date : 2020/12/21
// */
//@Primary
//@Component
//public class MySwaggerResourceProvider implements SwaggerResourcesProvider {
//    /**
//     * swagger2默认的url后缀
//     */
//    private static final String SWAGGER2URL = "/v2/api-docs";
//
//    /**
//     * 网关路由
//     */
//    private final RouteLocator routeLocator;
//
//    /**
//     * 网关配置
//     */
//    private final GatewayProperties gatewayProperties;
//
//    /**
//     * 网关应用path
//     */
//    @Value("${server.servlet.context-path:\"\"}")
//    private String contextPath;
//
//    /**
//     * 网关应用名称
//     */
//    @Value("${spring.application.name:\"\"}")
//    private String applicationName;
//
//    @Autowired
//    public MySwaggerResourceProvider(RouteLocator routeLocator, GatewayProperties gatewayProperties) {
//        this.routeLocator = routeLocator;
//        this.gatewayProperties = gatewayProperties;
//    }
//
//
//    @Override
//    public List<SwaggerResource> get() {
//        List<SwaggerResource> resources = new ArrayList<>();
//        List<String> routes = new ArrayList<>();
//        routeLocator.getRoutes().subscribe(route -> routes.add(route.getId()));
//        gatewayProperties.getRoutes().stream().filter(routeDefinition -> routes.contains(routeDefinition.getId()))
//                .forEach(routeDefinition -> routeDefinition.getPredicates().stream()
//                        .filter(predicateDefinition -> "Path".equalsIgnoreCase(predicateDefinition.getName()))
//                        .forEach(predicateDefinition -> resources
//                                .add(swaggerResource(routeDefinition.getId(), predicateDefinition.getArgs()
//                                        .get(NameUtils.GENERATED_NAME_PREFIX + "0").replace("/**", SWAGGER2URL)))));
//        return resources;
//    }
//
//    private static SwaggerResource swaggerResource(String name, String location) {
//        SwaggerResource swaggerResource = new SwaggerResource();
//        swaggerResource.setName(name);
//        swaggerResource.setLocation(location);
//        swaggerResource.setSwaggerVersion("2.0");
//        return swaggerResource;
//    }
//
//
////    @Override
////    public List<SwaggerResource> get() {
////        List<SwaggerResource> resources = new ArrayList<>();
////        List<String> routeHosts = new ArrayList<>();
////        // 获取所有可用的host : serviceId
////        routeLocator.getRoutes().filter(route -> route.getUri().getHost() != null)
////                .filter(route -> !applicationName.equals(route.getUri().getHost()))
////                .subscribe(route -> routeHosts.add(route.getUri().getHost()));
////
////        // 记录已经添加过的server，存在同一个应用注册了多个服务在eureka上
////        Set<String> dealed = new HashSet<>();
////        routeHosts.forEach(instance -> {
////            // 拼接url
////            String url = "/" + instance.toLowerCase() + SWAGGER2URL;
////            if (!dealed.contains(url)) {
////                dealed.add(url);
////                SwaggerResource swaggerResource = new SwaggerResource();
////                swaggerResource.setUrl(url);
////                swaggerResource.setName(instance);
////                resources.add(swaggerResource);
////            }
////        });
////        return resources;
////    }
//}
