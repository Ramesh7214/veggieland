package com.veggieland.services;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Import;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.veggieland.datastore.config.DatabaseConfig;

@SpringBootApplication
@Import(DatabaseConfig.class)
@EnableTransactionManagement
@ComponentScans(value = { 
	      @ComponentScan("com.veggieland.datastore"),
	      @ComponentScan("com.veggieland.services") 
	    })
public class VeggielandServicesApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(VeggielandServicesApplication.class, args);
	}
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(VeggielandServicesApplication.class);
	}
	
}
