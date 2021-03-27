package com.saintpress.eatgo.domain;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RestaurantRepositoryImpl implements RestaurantRepository {

    private List<Restaurant> restaurants = new ArrayList();

    public RestaurantRepositoryImpl(){
        restaurants.add(new Restaurant(1004L,"bob zip", "seoul"));
        restaurants.add(new Restaurant(2020L,"cyber food", "seoul"));
    }

    @Override
    public List<Restaurant> findAll() {

        return restaurants;
    }

    @Override
    public Restaurant findId(Long id) {
        return restaurants.stream()
                .filter(r -> r.getId().equals(id))
                .findFirst()
                .orElse(null);
    }
}