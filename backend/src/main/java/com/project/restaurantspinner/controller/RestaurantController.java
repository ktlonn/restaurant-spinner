package com.project.restaurantspinner.controller;
import com.project.restaurantspinner.dao.RestaurantDao;
import com.project.restaurantspinner.model.Restaurant;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping(path="/restaurants")
@CrossOrigin
public class RestaurantController {

    private RestaurantDao restaurantDao;

    public RestaurantController(RestaurantDao restaurantDao) {
        this.restaurantDao = restaurantDao;
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(path="/add")
    public Restaurant addRestaurant(@RequestBody Restaurant restaurant) {
        return restaurantDao.addRestaurant(restaurant);
    }

    @GetMapping(path="/all")
    public List<Restaurant> getRestaurants() {
        return restaurantDao.retrieveAllRestaurants();
    }

    @GetMapping(path="/{id}")
    public Restaurant getRestaurantById(@PathVariable Long id) {
        return restaurantDao.findRestaurantById(id);
    }

    @PutMapping(path="/update")
    public boolean updateRestaurant(@RequestBody Restaurant restaurant) {
        return restaurantDao.updateRestaurant(restaurant);
    }

    @DeleteMapping(path="/delete/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean deleteRestaurant(@PathVariable Long id) {
        return restaurantDao.deleteRestaurant(id);
    }

}
