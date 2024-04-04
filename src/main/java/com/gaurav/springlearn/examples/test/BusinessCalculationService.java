package com.gaurav.springlearn.examples.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class BusinessCalculationService {

    DataService dataService;

    public BusinessCalculationService(DataService dataService){
        this.dataService = dataService;
    }

    public int findMax(){
        return Arrays.stream(dataService.getData()).max().orElse(0);
    }

}
