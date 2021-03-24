package com.saintpress.eatgo.domain;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class RestaurantTests {

    @Test
    public void creation(){
        Restaurant restaurant = new Restaurant("bob zip", "seoul");
        assertThat(restaurant.getName(), is("bob zip"));
        assertThat(restaurant.getAddress(), is("seoul"));
    }

    @Test
    public void information(){
        Restaurant restaurant = new Restaurant("bob zip", "seoul");
        assertThat(restaurant.getInformation(), is("bob zip in seoul"));
    }
}