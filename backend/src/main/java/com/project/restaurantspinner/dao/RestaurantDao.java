package com.project.restaurantspinner.dao;
import com.project.restaurantspinner.model.Restaurant;

import java.util.List;

public interface RestaurantDao {

    Restaurant addRestaurant(Restaurant restaurant);
    List<Restaurant> retrieveAllRestaurants();
    Restaurant findRestaurantById(Long id);
    boolean updateRestaurant(Restaurant restaurant);
    boolean deleteRestaurant(Long id);

}
