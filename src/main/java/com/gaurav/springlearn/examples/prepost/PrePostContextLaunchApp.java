package com.gaurav.springlearn.examples.prepost;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class HelloClass{

    SomeDependency someDependency;
    public HelloClass(SomeDependency someDependency){
        super();
        System.out.println("constructor wiring dependency");
        this.someDependency = someDependency;
    }

    @PostConstruct
    public void initialize(){
        someDependency.doSome();
    }

    @PreDestroy
    public void destroy(){
        System.out.println("destroying...");
        someDependency.clean();
    }
}

@Component
class SomeDependency{

    public void doSome(){
        System.out.println("have to do something...");
    }

    public void clean(){
        System.out.println("cleaning...");
    }

}

@Configuration
@ComponentScan
public class PrePostContextLaunchApp {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(PrePostContextLaunchApp.class);
//        context.getBean(HelloClass.class);
//        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
    }
}
