import Vue from 'vue'
import VueRouter from 'vue-router'
import HomeView from '../views/HomeView.vue'
import RestaurantsView from '../views/RestaurantsView.vue'
import SpinnerView from '../views/SpinnerView.vue'

Vue.use(VueRouter)

const routes = [
  {
    path: '/',
    name: 'home',
    component: HomeView
  },
  {
    path: '/restaurants',
    name: 'restaurants',
    component: RestaurantsView
  },
  { 
    path: '/spinner',
    name: 'spinner',
    component: SpinnerView
  }
]

const router = new VueRouter({
  routes
})

export default router
