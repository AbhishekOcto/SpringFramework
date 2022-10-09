package com.bridgelabz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {
	
	@Autowired
	Laptop lappy;
	
	public void drive() {
		System.out.println("Driving...");
		lappy.compile();
	}
	

}
