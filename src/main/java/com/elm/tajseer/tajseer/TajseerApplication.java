package com.elm.tajseer.tajseer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
@EnableJpaRepositories
public class TajseerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TajseerApplication.class, args);

		//System.out.println(user.setpassword(new BCryptPasswordEncoder().encode(user.getpassorwd()))new BCryptPasswordEncoder().encode("123"));
	}

}
