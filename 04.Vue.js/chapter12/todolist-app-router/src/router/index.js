import { createRouter, createWebHistory } from "vue-router";

import Home from "@/pages/Home.vue";
import About from "@/pages/About.vue";
import TodoList from "@/pages/TodoList.vue";
import AddTodo from "@/pages/AddTodo.vue";
import EditTodo from "@/pages/EditTodo.vue";
import NotFound from "@/pages/NotFound.vue";

const router = createRouter({
  history: createWebHistory(),
  routes: [
    { path: "/", name: "home", component: Home },
    { path: "/about", name: "about", component: About },
    { path: "/todos", name: "TodoList", component: TodoList },
    { path: "/todos/add", name: "AddTodo", component: AddTodo },
    { path: "/todos/edit/:id", name: "EditTodo", component: EditTodo },
    { path: "/:paths(.*)*", name: "NotFound", component: NotFound },
  ],
});

export default router;
