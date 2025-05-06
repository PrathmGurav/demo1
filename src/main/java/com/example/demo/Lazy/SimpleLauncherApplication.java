package com.example.demo.Lazy;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.example.demo.game.GameRunner;
import com.example.demo.game.GammingConsole;

@Component
class ClassA{
	
	
}

//@Component
//class ClassB{
//	private ClassA classA;
//	
//	public ClaasB(ClassA classA) {
//		this.classA = classA;
//	}
//}


@Configuration
@Component
public class SimpleLauncherApplication {

	public static void main(String[] args) {
		try (// 1 Launch a Spring context
				var context = new AnnotationConfigApplicationContext(SimpleLauncherApplication.class);) {
			
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
	

		}

	}

}
