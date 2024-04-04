package com.gaurav.springlearn.examples.scope;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class NormalClass{

}

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
class ScopeClass{

}

@Configuration
@ComponentScan
public class SpringScopeLaunchApp {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(SpringScopeLaunchApp.class);

        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

        // all time same instance
        System.out.println(context.getBean(NormalClass.class));
        System.out.println(context.getBean(NormalClass.class));
        System.out.println(context.getBean(NormalClass.class));

        // all time new instance
        System.out.println(context.getBean(ScopeClass.class));
        System.out.println(context.getBean(ScopeClass.class));
        System.out.println(context.getBean(ScopeClass.class));
        System.out.println(context.getBean(ScopeClass.class));
        System.out.println(context.getBean(ScopeClass.class));

    }
}
