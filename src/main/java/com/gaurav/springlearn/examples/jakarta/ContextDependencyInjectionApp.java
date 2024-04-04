package com.gaurav.springlearn.examples.jakarta;

import jakarta.inject.Inject;
import jakarta.inject.Named;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;


//@Component
@Named
class Hello{

//    @Autowired
    @Inject
    Dependency dependency;

    public void check(){
        System.out.println("have some " + dependency);
    }
}

@Component
class Dependency{

}

@Configuration
@ComponentScan
public class ContextDependencyInjectionApp {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ContextDependencyInjectionApp.class);
        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        context.getBean(Hello.class).check();
    }
}
