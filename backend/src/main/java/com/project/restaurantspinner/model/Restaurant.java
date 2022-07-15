package com.project.restaurantspinner.model;

public class Restaurant {

    private Long id;
    private String name;
    private String city;
    private String type;
    private String menuUrl;

    public Restaurant() {}

    public Restaurant(Long id, String name, String city, String type, String menuUrl) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.type = type;
        this.menuUrl = menuUrl;
    }

    public Long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMenuUrl() {
        return menuUrl;
    }

    public void setMenuUrl(String menuUrl) {
        this.menuUrl = menuUrl;
    }

    @Override
    public String toString() {
        return "restaurant{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", type='" + type + '\'' +
                ", menuUrl='" + menuUrl + '\'' +
                '}';
    }
}
