<template>
  <li><input type="checkbox" :checked="idol.checked" /> {{ idol.name }}</li>
</template>

<script>
import Idol from "../Idol";
export default {
  name: "CheckboxItem",
  props: {
    idol: Idol,
  },
};
</script>
