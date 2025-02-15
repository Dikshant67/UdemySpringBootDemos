package com.springdemo.learn_spring_framework.examples.a1;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

//MyBussinessClass
//Dependency1
//Dependency2
@Component
class MyBussinessClass{
	//field injection examples
	
	Dependency1 dependency1;
	
	Dependency2 dependency2;
	//setter injection
//	@Autowired
//	public void setDependency1(Dependency1 dependency1) {
//		System.out.println("Setter Injection dep1");
//		this.dependency1 = dependency1;
//	}
//	@Autowired
//	public void setDependency2(Dependency2 dependency2) {
//		System.out.println("Setter Injection dep2");
//		this.dependency2 = dependency2;
//	}
	
	

	public String toString() {
		return "Using "+dependency1 + " and "+dependency2;
				
	}
	//Contructor based injection
//	@Autowired
	public MyBussinessClass(Dependency1 dependency1, Dependency2 dependency2) {
		super();
		this.dependency1 = dependency1;
		this.dependency2 = dependency2;
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
	System.out.println(context.getBean(MyBussinessClass.class));;
	}
	

	}
}
