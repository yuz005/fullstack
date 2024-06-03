<template>
  <div>
    <h2>콘솔을 확인합니다.</h2>
  </div>
</template>

<script setup>
import axios from "axios";
const requestAPI = async () => {
  const url = "/api/todos";
  const response = await axios.get(url);
  console.log("# 응답객체 : ", response);
};
requestAPI();
</script>

<!-- 
  //이거는 하나, 1번만 조회되는것임
<script setup> 
import axios from "axios";
const requestAPI = () => {
  const url = "http://localhost:3000/todos/1";
  const url = "/api/todos/1";
  axios.get(url).then((response) => {
    console.log("# 응답객체 : ", response);
  });
};
requestAPI();

//4건의 목록을 조회한 후 첫번째, 두번째 할일을 순차적으로 조회합니다.
</script>
<script setup>
import axios from "axios";
const listUrl = "/api/todos";
const todoUrlPrefix = "/api/todos/";
const requestAPI = () => {
  let todoList = [];
  axios
    .get(listUrl)
    .then((response) => {
      todoList = response.data;
      console.log("# TodoList : ", todoList);
      return todoList[0].id;
    })
    .then((id) => {
      return axios.get(todoUrlPrefix + id);
    })
    .then((response) => {
      console.log("## 첫번째 Todo : ", response.data);
      return todoList[1].id;
    })
    .then((id) => {
      axios.get(todoUrlPrefix + id).then((response) => {
        console.log("## 두번째 Todo : ", response.data);
      });
    });
};
requestAPI();
</script>
-->
