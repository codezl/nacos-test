package com.zc.dd.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.ApiKey;
import springfox.documentation.service.AuthorizationScope;
import springfox.documentation.service.SecurityReference;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spi.service.contexts.SecurityContext;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger.web.ApiKeyVehicle;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Configuration //配置类
@EnableSwagger2 //开启swagger2的自动配置
public class SwaggerConfig {
             //Swagger实例Bean是Docket，所以通过配置Docket实例来配置Swaggger
    @Bean   //配置Docket具体的参数
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()// 通过.select()方法，去配置扫描接口,RequestHandlerSelectors配置如何扫                          // 描接口
                .apis(RequestHandlerSelectors.basePackage("com.zc.dd.controller"))
                .paths(PathSelectors.any())//表示扫描任何接口
                .build()
                .securitySchemes(securitySchemes())
                .securityContexts(securityContexts())
                .groupName("test-api");
    }
    //
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("测试API接口文档")
                .description("测试API接口文档")
                .termsOfServiceUrl("http://localhost:8090/")//这里的端口号是项目的端口号
                .version("1.0")
                .build();
    }

    private List<ApiKey> securitySchemes() {
        return new ArrayList<ApiKey>(Collections.singleton(new ApiKey("Authorization", "Authorization", ApiKeyVehicle.HEADER.getValue())));
    }

    private List<SecurityContext> securityContexts() {
        return new ArrayList<SecurityContext>(
                Collections.singleton(SecurityContext.builder()
                        .securityReferences(defaultAuth())
                        .forPaths(PathSelectors.regex("^(?!auth).*$"))
                        .build()));
    }

    List<SecurityReference> defaultAuth() {
        AuthorizationScope authorizationScope = new AuthorizationScope("global", "accessEverything");
        AuthorizationScope[] authorizationScopes = new AuthorizationScope[1];
        authorizationScopes[0] = authorizationScope;
        return new ArrayList<SecurityReference>(
                Collections.singleton(new SecurityReference("Authorization", authorizationScopes)));
    }
}