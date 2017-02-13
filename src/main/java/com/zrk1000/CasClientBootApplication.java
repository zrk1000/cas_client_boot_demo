package com.zrk1000;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.Import;

import com.zrk1000.cas.config.CasConfig;


@Import(CasConfig.class)
@SpringBootApplication
public class CasClientBootApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(CasClientBootApplication.class, args);
	}
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(CasClientBootApplication.class);
	}

}
