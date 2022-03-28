package com.springsecurity.SpringsecurityDemos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.springsecurity.SpringsecurityDemos.examples.UserRepository;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = UserRepository.class)
public class SpringsecurityDemosApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringsecurityDemosApplication.class, args);
	}

}
