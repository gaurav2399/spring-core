package com.gaurav.springlearn.examples.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
@ComponentScan
public class RealWorldSpringApp {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(RealWorldSpringApp.class);
        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        System.out.println("max value is " +
                        context.getBean(BusinessCalculationService.class).findMax());
    }

}
