package com.gaurav.springlearn.examples.intialization;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
class ClassA{ }

@Component
@Lazy
class ClassB{

    ClassA classA;

    public ClassB(ClassA classA){
        System.out.println("inside b constructor");
        this.classA = classA;
    }

    public void doSome(){
        System.out.println("do something...");
    }
}

@Configuration
@ComponentScan
public class SpringBeanInitialization {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(SpringBeanInitialization.class);
        context.getBean(ClassB.class).doSome();
    }
}
