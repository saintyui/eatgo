package com.saintpress.eatgo.domain;

import java.util.List;

public interface RestaurantRepository {
    List<Restaurant> findAll();

    Restaurant findId(Long id);
}
