package com.saintpress.eatgo.domain;

import java.util.ArrayList;
import java.util.List;

public class RestaurantRepository {

    private List<Restaurant> restaurants = new ArrayList();

    public RestaurantRepository(){
        restaurants.add(new Restaurant(1004L,"bob zip", "seoul"));
        restaurants.add(new Restaurant(2020L,"cyber food", "seoul"));
    }

    public List<Restaurant> findAll() {

        return restaurants;
    }

    public Restaurant findId(Long id) {
        return restaurants.stream()
                .filter(r -> r.getId().equals(id))
                .findFirst()
                .orElse(null);
    }
}
