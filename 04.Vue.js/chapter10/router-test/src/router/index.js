import { createRouter, createWebHistory } from "vue-router";
import Home from "../pages/Home.vue";
import Members from "@/pages/Members.vue";
import About from "@/pages/About.vue";
import Videos from "@/pages/Videos.vue";

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
  {
      path: "/",
      name: "home",
      component: Home,
    },
    {
      path: "/About",
      name: "about"
      component: About,
    },
    {
      path: "/Members",
      name: "Members",
      component: Members,
    },
    {
      path: "/Videos",
      name: " videos",
      component: Videos
    },
  ],
});

export default router;
