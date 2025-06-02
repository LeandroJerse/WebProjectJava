package com.devsuperior.dscommerce.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = "com.devsuperior.dscommerce.entities")
@EnableJpaRepositories(basePackages = "com.devsuperior.dscommerce.repositories")
@ComponentScan(basePackages = "com.devsuperior.dscommerce")
public class DscommerceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DscommerceApplication.class, args);
		System.out.println("Aplicação iniciada com sucesso!");
	}

}
