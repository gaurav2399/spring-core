package com.gaurav.springlearn.examples.di;

import com.gaurav.springlearn.game.GameRunner;
import com.gaurav.springlearn.game.GamingConsole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;


@Component
class BusinessLogic{


    // Field Type Dependency Injection
//    @Autowired
    Dependency1 dependency1;

//    @Autowired
    Dependency2 dependency2;

    @Autowired
    public BusinessLogic(Dependency1 dependency1, Dependency2 dependency2) {
        System.out.println("constructor set dep1 and dep2");
        this.dependency1 = dependency1;
        this.dependency2 = dependency2;
    }

    // Setter based dependency injection
//    @Autowired
//    public void setDependency1(Dependency1 dependency1) {
//        System.out.println("setter dep 1");
//        this.dependency1 = dependency1;
//    }
//
//    @Autowired
//    public void setDependency2(Dependency2 dependency2) {
//        System.out.println("Setter dep 2");
//        this.dependency2 = dependency2;
//    }

    @Override
    public String toString() {
        return "Using dep1 " + dependency1 + " and dep2 " + dependency2;
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
public class DependencyInjectionApp {

    public static void main(String[] args) {

        try (var context = new AnnotationConfigApplicationContext(DependencyInjectionApp.class)) {
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
            System.out.println(context.getBean(BusinessLogic.class));
        }

    }

}
