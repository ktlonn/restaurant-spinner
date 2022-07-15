<template>
  <div class="restaurants">
    <restaurants-list />
  </div>
</template>

<script>
import RestaurantsList from '../components/RestaurantsList.vue'

export default {
  name: 'RestaurantsView',
  components: {
    RestaurantsList
  }
}
</script>

<style>

</style>