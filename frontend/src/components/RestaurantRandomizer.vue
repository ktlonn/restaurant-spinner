<template>
  <div class="randomize">
    <h1>Spin for a Restaurant!</h1>
    <div>
      <button v-on:click="randomizeRestaurant">Spin!</button>
      <div id="winner" v-show="wasClicked">
        <h3>{{randomRestaurant.name}}</h3>
        <p>{{randomRestaurant.type}} restaurant in {{randomRestaurant.city}}</p>
      </div>
    </div>
  </div>
</template>

<script>
import restaurantService from '../services/RestaurantService.js'

export default {
  name: "restaurant-randomizer",
  data() {
    return {
      restaurants: [],
      restaurantIds: [],
      randomRestaurant: Object,
      wasClicked: false
    }
  },
  created() {
    restaurantService.list().then((response) => {
      this.restaurants = response.data;
      this.populateRestaurantIds();
    });
  },
  methods: {
    populateRestaurantIds() {
      this.restaurants.forEach((restaurant) => this.restaurantIds.push([restaurant.id]));
    },
    randomizeRestaurant() {
      let size = this.restaurantIds.length;
      let randomId = this.restaurantIds[Math.floor(Math.random() * size)];
      restaurantService.get(randomId).then((response) => {
        this.randomRestaurant = response.data;
        this.wasClicked = true;
      })
    },
    // viewRestaurantDetails(id) {
    //   this.$router.push(`/${id}`);
    // }
  }
}
</script>

<style>

</style>