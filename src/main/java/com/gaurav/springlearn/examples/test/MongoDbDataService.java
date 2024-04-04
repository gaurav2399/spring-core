package com.gaurav.springlearn.examples.test;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MongoDbDataService implements DataService{
    @Override
    public int[] getData() {
        return new int[] {11, 22, 33, 44, 55};
    }

}
