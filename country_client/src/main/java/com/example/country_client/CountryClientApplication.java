package com.example.country_client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CountryClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(CountryClientApplication.class, args);
	}

}
