package com.yupi.yuojbackenduserservice.config;

import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2WebMvc;

/**
 * @author WX
 * @date 2026-03-18 22:37
 * @description Knife4j配置类
 **/
@Configuration
@EnableSwagger2WebMvc
public class Knife4jConfig {
    public Docket docket() {
        Docket docket = new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(new ApiInfoBuilder()
                        .description("API文档")
                        .termsOfServiceUrl("http://localhost:8080/doc.html")
                        .contact("17537840252")
                        .version("1.0")
                        .build()
                )
                // 分组名称
                .groupName("用户服务")
                .select()
                // 这里指定Controller扫描包路径
                .apis(RequestHandlerSelectors.basePackage("com.yupi.yuojbackenduserservice.controller"))
                .paths(PathSelectors.any())
                .build();
        return docket;
    }
}
