package com.saintpress.eatgo.application;

import com.saintpress.eatgo.domain.*;
import com.saintpress.eatgo.domain.MenuItem;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.awt.*;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class RestaurantServiceTest {

    private RestaurantService restaurantService;

    private RestaurantRepository restaurantRepository;

    private MenuItemRepository menuItemRepository;

    @Before
    public void setUp(){
        RestaurantRepository restaurantRepository = new RestaurantRepositoryImpl();
        menuItemRepository = new MenuItemRepositoryImpl();
        restaurantService = new RestaurantService(restaurantRepository, menuItemRepository);
    }

    @Test
    public void getRestaurants(){
        List<Restaurant> restaurants = restaurantService.getRestaurants();

        Restaurant restaurant = restaurants.get(0);
        assertThat(restaurant.getId(),is(1004L));
    }

    @Test
    public void getRestaurant(){
        Restaurant restaurant = restaurantService.getRestaurant(1004L);

        assertThat(restaurant.getId(), is(1004L));

        MenuItem menuItem = restaurant.getMenuItems().get(0);
        assertThat(menuItem.getName(), is("kimchi"));
    }
}