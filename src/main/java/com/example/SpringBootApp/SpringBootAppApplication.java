package com.example.SpringBootApp;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
public class SpringBootAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAppApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext arguments) {
		return args -> {
			System.out.println("Lets inspect the beans provided by Spring boot:");

			String[] beanNames = arguments.getBeanDefinitionNames();
			Arrays.sort(beanNames);
			for(String beanName : beanNames) {System.out.println(beanName);}
		};
	}
}
