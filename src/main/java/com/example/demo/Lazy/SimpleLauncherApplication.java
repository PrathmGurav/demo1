package com.example.demo.Lazy;

import java.util.Arrays;
import java.util.HashSet;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
class ClassA{
	
	
}

@Component
//@Lazy
class ClassB{
	private ClassA classA;
	
	public ClassB(ClassA classA) {
		System.out.println("Some initialization Logic executed!");
		this.classA = classA;
	}
}


@Configuration
@ComponentScan
public class SimpleLauncherApplication {

	public static void main(String[] args) {
		try (// 1 Launch a Spring context
				var context = new AnnotationConfigApplicationContext(SimpleLauncherApplication.class);) {
			System.out.println("Context Initialization Done!");
			HashSet<Integer> a =new HashSet<Integer>();
//			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			
	

		}

	}

}
