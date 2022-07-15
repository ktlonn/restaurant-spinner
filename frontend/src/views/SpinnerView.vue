<template>
  <div class="spinner">
    <restaurant-randomizer />
  </div>
</template>

<script>
import RestaurantRandomizer from '../components/RestaurantRandomizer.vue'

export default {
  name: 'SpinnerView',
  components: {
    RestaurantRandomizer
  }
}
</script>

<style>

</style>