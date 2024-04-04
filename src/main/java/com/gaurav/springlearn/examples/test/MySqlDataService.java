package com.gaurav.springlearn.examples.test;

import org.springframework.stereotype.Component;

@Component
public class MySqlDataService implements DataService{
    @Override
    public int[] getData() {
        return new int[] {1, 2, 3, 4, 5, 6};
    }
}
