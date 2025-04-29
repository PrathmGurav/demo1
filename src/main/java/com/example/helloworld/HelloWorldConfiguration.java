package com.example.helloworld;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name, int age, Address address) {};

record Address(String location, String city) {};

@Configuration
public class HelloWorldConfiguration {
	
	@Bean
	public String name() {
		return "Prathmesh";
	}
	
	//Giving name to Bean
	@Bean(name = "MyName")
	public int age() {
		return 23;
	}
	
	//HardCoaded name, age and Address
	//Making Class object and also passed class obj
	@Bean
	public Person person() {
		Person person = new Person("Prathm", 23, new Address("Rajarampuri", "Kolhapur"));
		return person;
	}
	
//	Without HardCoding. Using Method Call to initialize name and age and Address
	@Bean
	public Person person2ByMethodCall() {
		Person person = new Person(name(), age(), address());
		return person;
	}
	
//VERY IMP //Without HardCoding. Using Parameters to initialize name and age and Address
//First it check for given parameters name bean if not present then it takes any available beans of same data type
//and in this case there should be only one bean need to be present of same data type
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
