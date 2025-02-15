package com.springdemo.learn_spring_framework.examples.a0;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class DependencyInjectionLauncherApplication {
//	@Bean
//	public GamingConsole game() {
//		var game=new PacmanGame();
//		
//		return game;
//	}
//	
//	@Bean
//	public GameRunner gameRunner(GamingConsole game) {
//		var gameRunner=new GameRunner(game);
//		return gameRunner;
//	}
	public static void main(String[] args) {
	try(var context=new	AnnotationConfigApplicationContext(DependencyInjectionLauncherApplication.class)){
	Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
	}
	

	}
}
