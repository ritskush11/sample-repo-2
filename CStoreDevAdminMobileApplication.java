package com.savearound.cstore.mobile.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@ComponentScans({ @ComponentScan("com.savearound.cstore.mobile.rest"),
		@ComponentScan("com.savearound.cstore.mobile.common"), @ComponentScan("com.savearound.cstore.mobile.model"),
		@ComponentScan("com.savearound.cstore.mobile.email"),
		@ComponentScan("com.savearound.cstore.mobile.persistence.db"),
		@ComponentScan("com.savearound.cstore.mobile.persistence.mapper"),
		@ComponentScan("com.savearound.cstore.mobile.persistence.domain"),
		@ComponentScan("com.savearound.cstore.mobile.persistence.service"),
		@ComponentScan("com.savearound.cstore.mobile.interceptor") })
public class CStoreDevAdminMobileApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(CStoreDevAdminMobileApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(CStoreDevAdminMobileApplication.class, args);
		LOGGER.info("Spring Boot started successfully..");
		
		//change for pool
	}
}
