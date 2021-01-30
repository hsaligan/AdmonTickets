package com.rappi.wsrestvuelo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.rappi.wsrestvuelo.SwaggerConfiguration;

@SpringBootApplication
@Import(SwaggerConfiguration.class)
public class AdmonVueloApplication implements WebMvcConfigurer {

	public static void main(String[] args) {
		SpringApplication.run(AdmonVueloApplication.class, args);
	}
	
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {

		registry.addResourceHandler("swagger-ui.html")
			.addResourceLocations("classpath:/META-INF/resources/");
	}
	
}
