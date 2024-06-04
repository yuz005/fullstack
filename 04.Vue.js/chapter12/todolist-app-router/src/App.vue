<template>
  <div class="container">
    <header></header>
  </div>
</template>

<script setup>
import { reactive,computed, provide } from 'vue'
import Header from './components/Header.vue';
const states = reactive({
  todoList : [
  { id:1, todo:"ES6학습", desc:"설명1", done: false},
  { id:1, todo:"React 학습", desc:"설명2", done: false},
  { id:1, todo:"ContextAPT학습", desc:"설명3", done: true},
  { id:1, todo:"야구경기 관람하기", desc:"설명4", done: false},
  ]
})
const addTodo = ({ todo, desc }) => {
  states.todoList.push({ id: new Date().getTime(), todo, desc, done: false})
}
</script>
