package com.bridgelabz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class LearnSpringApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(LearnSpringApplication.class, args);
		Car car = context.getBean(Car.class); //getBean belongs to an interface called "ApplicationContext"
		car.drive();
	}

}
