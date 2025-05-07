package com.example.demo.BeanPrinting.JakartaCDI;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import jakarta.inject.Inject;
import jakarta.inject.Named;

//@Component
@Named
class BusinessService{
	private DataService dataService;
	
//	@Autowired
	@Inject
	public void setDataService(DataService dataService) {
		System.out.println("Setter Injection");
		this.dataService = dataService;
	}
}

//@Component
@Named
class DataService{
	
}

@ComponentScan
public class SimpleLauncherApplication {


	public static void main(String[] args) {
		try (// 1 Launch a Spring context
				var context = new AnnotationConfigApplicationContext(SimpleLauncherApplication.class);) {
			
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

		}

	}

}
