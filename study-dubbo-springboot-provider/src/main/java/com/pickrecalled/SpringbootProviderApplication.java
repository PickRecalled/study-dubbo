package com.pickrecalled;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@ImportResource(locations = "classpath:dubbo-provider.xml")
@SpringBootApplication
public class SpringbootProviderApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringbootProviderApplication.class, args);
	}
}
