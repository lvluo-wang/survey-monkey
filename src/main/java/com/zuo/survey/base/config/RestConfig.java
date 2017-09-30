package com.zuo.survey.base.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.core.annotation.Order;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.multipart.support.MultipartFilter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@Configuration
@ComponentScan({"com.zuo.survey.base.rest"})
@EnableSwagger2
@Import({})
public class RestConfig extends WebMvcConfigurerAdapter {


    @Bean
    public Docket docket(@Value("${survey.swagger.enabled}") boolean enabled) {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.withClassAnnotation(RestController.class))
                .paths(PathSelectors.any())
                .build()
                .enable(enabled);
    }


//    @Bean
//    public CommonsMultipartResolver multipartResolver() {
//        CommonsMultipartResolver multipart = new CommonsMultipartResolver();
//        multipart.setMaxUploadSize(10 * 1024 * 1024);
//        return multipart;
//    }

//    @Bean
//    @Order(0)
//    public MultipartFilter multipartFilter() {
//        MultipartFilter multipartFilter = new MultipartFilter();
//        multipartFilter.setMultipartResolverBeanName("multipartReso????lver");
//        return multipartFilter;
//    }
}