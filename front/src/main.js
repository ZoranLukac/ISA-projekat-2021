import Vue from 'vue'
import App from './App.vue'
import VueRouter from 'vue-router'

import Routes from './routes'


export const bus = new Vue();

Vue.use(VueRouter);
Vue.config.productionTip = false;

const router = new VueRouter({
  mode:'history',
  routes:Routes
});

new Vue({
  el: '#app',
  render: h => h(App),
  router:router
}).$mount('#app')
