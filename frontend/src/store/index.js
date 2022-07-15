import Vue from 'vue'
import Vuex from 'vuex'

Vue.use(Vuex)

export default new Vuex.Store({
  state: {
    restaurants: []
  },
  mutations: {
    SET_RESTAURANTS(state, data) {
      state.restaurants = data;
    }
  },
  actions: {
  },
  modules: {
  }
})
