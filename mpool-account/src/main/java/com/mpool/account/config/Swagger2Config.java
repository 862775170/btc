package com.mpool.account.config;

import javax.servlet.ServletContext;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.paths.AbstractPathProvider;
import springfox.documentation.spring.web.paths.RelativePathProvider;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * swagger 配置
 * 
 * @author chen9
 *
 */
@Configuration
@EnableSwagger2
public class Swagger2Config {
	@Bean
	public Docket createRestApi(ServletContext servletContext) {

		return new Docket(DocumentationType.SWAGGER_2).pathProvider(new RelativePathProvider(servletContext) {

//			@Override
//			protected String applicationPath() {
//				// TODO Auto-generated method stub
//				return "/apis/";
//			}
		}).apiInfo(apiInfo()).select().apis(RequestHandlerSelectors.basePackage("com.mpool.account"))
				.paths(PathSelectors.any()).build();
	}

	private ApiInfo apiInfo() {
		String description = "";
		return new ApiInfoBuilder().description(description).version("1.0.0").build();

	}
}
