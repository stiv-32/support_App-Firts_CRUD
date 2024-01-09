import { createRouter, createWebHistory } from 'vue-router'
import HomeView from '../views/HomeView.vue'
import ListRequest from '../views/ListRequest.vue'
import RequestSol from '../views/RequestEdit.vue'
import EditInfo from '../views/RequestForm.vue'

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/',
      name: 'home',
      component: HomeView
    },
    {
      path: '/about',
      name: 'about',
      component: () => import('../views/AboutView.vue')
    },
    {
      path: '/ListSol',
      name: 'ListRequest',
      component: ListRequest
    },
     {
      path: '/RequestEdit',
      name: 'RequestEdit',
      component: RequestSol
     },
     {
      path: '/EditInf',
      name: 'EditInf',
      component: EditInfo
     }
  ]
})

export default router
