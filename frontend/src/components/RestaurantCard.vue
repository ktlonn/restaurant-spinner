<template>
  <div class="card" v-on:click="viewRestaurantDetails(restaurant.id)">
    <h3>{{restaurant.name}}</h3>
    <p>{{restaurant.type}} restaurant in {{restaurant.city}}</p>
  </div>
</template>

<script>
export default {
  name: "restaurant-card",
  props: {
    restaurant: Object
  },
  methods: {
    viewRestaurantDetails(id) {
      this.$router.push(`/${id}`);
    }
  }
}
</script>

<style>

</style>