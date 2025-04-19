package com.example.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name, int age, Address address) {
};

record Address(String location, String city) {
};

@Configuration
public class HelloWorldConfiguration {

	@Bean
	public String name() {
		return "Prathmesh";
	}

	// Giving name to Bean
	@Bean(name = "MyName")
	public int age() {
		return 23;
	}

	// HardCoaded name, age and Address
//	@Bean
//	public Person person() {
//		Person person = new Person("Prathm", 23, new Address("Sambhajinagar", "Kolhapur"));
//		return person;
//	}

////	Without HardCoding. Using Method Call to initialize name and age and Address
//	@Bean
//	public Person person2ByMethodCall() {
//		Person person = new Person(name(), age(), address());
//		return person;
//	}

	// Without HardCoding. Using Parameters to initialize name and age and Address
	@Bean
	public Person person3ByParameters(String name1, int age1, Address address) {
		Person person = new Person(name1, age1, address);
		return person;
	}

	@Bean
	public Address address() {
		Address address = new Address("Sambhajinagar", "Kolhapur");
		return address;
	}

}
