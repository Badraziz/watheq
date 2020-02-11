package com.elm.tajseer.tajseer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication

@ComponentScan
@EnableAutoConfiguration
@EnableJpaRepositories
public class TajseerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TajseerApplication.class, args);
	}

}
