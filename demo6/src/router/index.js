import Vue from 'vue'
import Router from 'vue-router'
import Home from '../components/Home'
import Login from '../components/user/Login'
import Register from "../components/user/Register";
import OrderManager from "../components/order/OrderManager";
import AddOrder from "../components/order/AddOrder";
import EditOrder from "../components/order/EditOrder";
import DeleteOrder from "../components/order/DeleteOrder";

Vue.use(Router)

export default new Router({
  routes: [
    {path: '/', component: Home},
    {path: '/home',name:"home", component: Home},
    {path: '/login',name:"login", component:Login},
    {path: '/register',name:"register", component:Register},
    {
      path: '/orderManager',
      component:OrderManager,
      children:[
        {path:"add",component:AddOrder},
        {path:"edit",component:EditOrder},
        {path:"delete",component:DeleteOrder}
      ]
    }
    ]
})
