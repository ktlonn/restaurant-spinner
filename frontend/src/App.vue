<template>
  <div id="app">
    <nav>
      <router-link to="/">Home</router-link> |
      <router-link to="/restaurants">Restaurants</router-link> |
      <router-link to="/spinner">Spin!</router-link>
    </nav>
    <router-view/>
  </div>
</template>

<script>
import restaurantService from './services/RestaurantService.js'

export default {
  created() {
    restaurantService.list().then((response) => {
      const allRestaurants = response.data;
      this.$store.commit("SET_RESTAURANTS", allRestaurants);
      return allRestaurants;
    });  
  }
}
</script>


<style>
#app {
  font-family: 'Open Sans', sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #4C4643;
}

nav {
  padding: 30px;
}

nav a {
  font-weight: bold;
  color: #4C4643;
}

nav a.router-link-exact-active {
  color: #FF7A5C;
}
</style>
