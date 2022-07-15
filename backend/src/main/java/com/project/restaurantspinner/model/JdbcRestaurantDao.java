package com.project.restaurantspinner.model;
import com.project.restaurantspinner.dao.RestaurantDao;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class JdbcRestaurantDao implements RestaurantDao {

    private JdbcTemplate jdbcTemplate;

    public JdbcRestaurantDao (JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public Restaurant addRestaurant(Restaurant restaurant) {

        String sql = "INSERT INTO restaurant (name, city, type, menu_url)" +
                "VALUES (?, ?, ?, ?) RETURNING id;";
        Long id = jdbcTemplate.queryForObject(sql, Long.class, restaurant.getName(), restaurant.getCity(),
                restaurant.getType(), restaurant.getMenuUrl());
        restaurant.setId(id);

        return restaurant;
    }

    @Override
    public List<Restaurant> retrieveAllRestaurants() {

        List<Restaurant> restaurants = new ArrayList<>();

        String sql = "SELECT * FROM restaurant;";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql);
        while(results.next()) {
            Restaurant restaurant = mapRowToRestaurant(results);
            restaurants.add(restaurant);
        }
        return restaurants;
    }

    @Override
    public Restaurant findRestaurantById(Long id) {

        Restaurant restaurant = new Restaurant();

        String sql = "SELECT * FROM restaurant WHERE id = ?;";
        SqlRowSet result = jdbcTemplate.queryForRowSet(sql, id);
        while(result.next()) {
            restaurant = mapRowToRestaurant(result);
        }

        return restaurant;
    }

    @Override
    public boolean updateRestaurant(Restaurant restaurant) {

        String sql = "UPDATE restaurant SET id = ?, name = ?, city = ?, type = ?, menu_url = ? " +
                "WHERE id = ?;";
        int rowUpdated = jdbcTemplate.update(sql, restaurant.getId(), restaurant.getName(),
                restaurant.getCity(), restaurant.getType(), restaurant.getMenuUrl(), restaurant.getId());

        return rowUpdated == 1;
    }

    @Override
    public boolean deleteRestaurant(Long id) {

        String sql = "DELETE FROM restaurant WHERE id = ?;";
        int rowDeleted = jdbcTemplate.update(sql, id);

        return rowDeleted == 1;
    }

    private Restaurant mapRowToRestaurant(SqlRowSet rs) {

        Restaurant restaurant = new Restaurant();

        restaurant.setId(rs.getLong("id"));
        restaurant.setName(rs.getString("name"));
        restaurant.setCity(rs.getString("city"));
        restaurant.setType(rs.getString("type"));
        restaurant.setMenuUrl(rs.getString("menu_url"));

        return restaurant;
    }
}
