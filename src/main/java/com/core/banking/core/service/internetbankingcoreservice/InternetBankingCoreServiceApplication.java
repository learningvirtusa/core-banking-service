package com.core.banking.core.service.internetbankingcoreservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class InternetBankingCoreServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InternetBankingCoreServiceApplication.class, args);
	}

}
