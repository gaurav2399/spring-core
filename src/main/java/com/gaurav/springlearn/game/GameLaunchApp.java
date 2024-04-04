package com.gaurav.springlearn.game;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.gaurav.springlearn.game")
public class GameLaunchApp {

	public static void main(String[] args) {

		try(var context = new AnnotationConfigApplicationContext(GameLaunchApp.class)){
			//		Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			context.getBean(GamingConsole.class).up();
			context.getBean(GameRunner.class).run();
		}

	}

}
