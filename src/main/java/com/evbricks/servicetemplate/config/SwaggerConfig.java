//package com.evbricks.servicetemplate.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import springfox.documentation.builders.ApiInfoBuilder;
//import springfox.documentation.service.ApiInfo;
//import springfox.documentation.spi.DocumentationType;
//import springfox.documentation.spring.web.plugins.Docket;
//
//import static springfox.documentation.builders.PathSelectors.regex;
//
//@Configuration
//public class SwaggerConfig {
//
//    @Bean
//    public Docket getBean() {
//        return new Docket(DocumentationType.SWAGGER_2).select().paths(regex("/api.*")).build().
//                apiInfo(getInfo());
//    }
//
//    private ApiInfo getInfo(){
//        return new ApiInfoBuilder().title("EVBricks").
//                description("Blabla").license("Bla Licence").build();
//    }
//}
