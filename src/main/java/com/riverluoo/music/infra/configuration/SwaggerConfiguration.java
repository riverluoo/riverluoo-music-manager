package com.riverluoo.music.infra.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import springfox.documentation.oas.annotations.EnableOpenApi;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spring.web.plugins.Docket;

import static java.util.Collections.emptyList;
import static springfox.documentation.builders.PathSelectors.any;
import static springfox.documentation.builders.RequestHandlerSelectors.basePackage;
import static springfox.documentation.spi.DocumentationType.OAS_30;

@Configuration
@EnableOpenApi
@Profile(value = {"local", "dev"})
public class SwaggerConfiguration {

    @Bean
    public Docket api() {
        return new Docket(OAS_30)
                .apiInfo(apiInfo())
                .host("http://39.96.69.79:8090")
                .enable(true)
                .select()
                .apis(basePackage("com.riverluoo.music"))
                .paths(any())
                .build();

    }

    private ApiInfo apiInfo() {
        return new ApiInfo(
                "Luoo Music API",
                "Luoo Music API",
                "1.0",
                null,
                null,
                null,
                null,
                emptyList());
    }

}
