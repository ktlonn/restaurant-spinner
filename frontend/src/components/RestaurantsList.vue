<template>
  <div class="list">
    <h1>Restaurant List</h1>
    <restaurant-card v-for="restaurant in allRestaurants" :restaurant="restaurant" :key="restaurant.id">
    </restaurant-card>
  </div>
</template>

<script>
import RestaurantCard from '../components/RestaurantCard.vue'

export default {
  name: "restaurants-list",
  components: {
    RestaurantCard
  },
  data() {
    return {
      allRestaurants: this.$store.state.restaurants
    }
  }
}
</script>

<style>

</style>