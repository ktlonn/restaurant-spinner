import axios from 'axios';

const http = axios.create({
  baseURL: "http://localhost:8080/restaurants"
});

export default {
  list() {
    return http.get("/all");
  },
  get(id) {
    return http.get(`/${id}`);
  }
}