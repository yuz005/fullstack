import { computed, reactive } from "vue";
import { defineStore } from "pinia";

export const useTodoListStore = defineStore("TodoList", () => {
  const state = reactive({
    todoList: [
      { id: 1, todo: "ES6학습", done: false },
      { id: 2, todo: "React학습", done: false },
      { id: 3, todo: "ContextAPI 학습", done: true },
      { id: 4, todo: "야구경기 관람", done: false },
    ],
  });
  const addTodo = (todo) => {
    state.todoList.push({ id: new Date().getTime(), todo, done: false });
  };
  const deleteTodo = (id) => {
    let index = state.todoList.findIndex((todo) => todo.id === id);
    state.todoList.splice(index, 1);
  };
  const toggleDone = (id) => {
    let index = state.todoList.findIndex((todo) => todo.id === id);
    state.todoList[index].done = !state.todoList[index].done;
  };
  const doneCount = computed(() => {
    return state.todoList.filter((todoITem) => todoITem.done === true).length;
  });
  const todoList = computed(() => state.todoList);
  return { todoList, doneCount, addTodo, deleteTodo, toggleDone };
});
