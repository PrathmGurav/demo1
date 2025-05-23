package com.example.demo.DependencyInjection;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.example.demo.game.GameRunner;
import com.example.demo.game.GammingConsole;

@Component
class YourBussinessClass{
//  Field Injection
//	@Autowired
	Dependency1 dependency1;
//	@Autowired
	Dependency2 dependency2;
	
//  Constructor Injection
//	@Autowired
	public YourBussinessClass(Dependency1 dependency1, Dependency2 dependency2) {
	super();
	
	System.out.println("Constructor Injection");
	this.dependency1 = dependency1;
	this.dependency2 = dependency2;
}

//  Setter Injection
//	@Autowired
	public void setDependency1(Dependency1 dependency1) {
		System.out.println("Setter Injection ---> Set Dependency1");
		this.dependency1 = dependency1;
	}

//	@Autowired
	public void setDependency2(Dependency2 dependency2) {
		System.out.println("Setter Injection ---> Set Dependency2");
		this.dependency2 = dependency2;
	}
	
	public String toString() {
		return "Using "+dependency1+" and "+dependency2;
	}
}

@Component
class Dependency1{
	
}

@Component
class Dependency2{
	 
}

@Configuration
@ComponentScan
public class DependencyInjectionLauncherApplication {


	public static void main(String[] args) {
		try (// 1 Launch a Spring context
				var context = new AnnotationConfigApplicationContext(DependencyInjectionLauncherApplication.class);) {
			
//			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			System.out.println(context.getBean(YourBussinessClass.class));
			
	

		}

	}

}
