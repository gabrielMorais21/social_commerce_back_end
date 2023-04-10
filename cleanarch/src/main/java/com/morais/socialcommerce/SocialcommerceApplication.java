package com.morais.socialcommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class SocialcommerceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SocialcommerceApplication.class, args);
	}

}
