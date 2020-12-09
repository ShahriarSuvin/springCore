package com.springcore.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/test/testconfig.xml");
		Animal animal = (Animal) context.getBean("aniref");
		
		System.out.println(animal.getName());
		System.out.println(animal.getBreed());
		System.out.println(animal.getOb().getBarking());
		System.out.println(animal.getOb2().getBarking());
		System.out.println(animal);
	}

}
