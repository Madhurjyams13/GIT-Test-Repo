package com.dbt.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication(scanBasePackages = 
{"com.dbt.controller","com.dbt.repository","com.dbt.model","com.dbt.dto","com.dbt.dao"})
@EntityScan("com.dbt.model")
@EnableJpaRepositories({"com.dbt.repository","com.dbt.dao"})
public class DbtWebServiceTestApplication {
 
	public static void main(String[] args) {
		SpringApplication.run(DbtWebServiceTestApplication.class, args);
	}

}
