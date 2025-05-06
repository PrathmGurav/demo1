package com.example.demo.BeanPrinting.RealWorldExample;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.example.demo.game.GameRunner;
import com.example.demo.game.GammingConsole;


@ComponentScan
public class RealWorldLauncherApplication {

	public static void main(String[] args) {
		try (// 1 Launch a Spring context
				var context = new AnnotationConfigApplicationContext(RealWorldLauncherApplication.class);) {
			
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			
			System.out.println(context.getBean(BusinessCalculationService.class).findMax());


		}

	}

}
