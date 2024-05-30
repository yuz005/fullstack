<template>
  <div>
    <h2>관심있는 K-POP 가수?</h2>
    <hr />
    <ul>
      <CheckboxItem v-for="idol in idols" :idol="idol" />
    </ul>
  </div>
</template>

<script>
import CheckboxItem from "./components/CheckboxItem.vue";
import Idol from "./Idol";
export default {
  name: "App",
  components: {
    CheckboxItem,
  },
  data() {
    return {
      idols: [
        new Idol(1, "BTS", true),
        new Idol(2, "IVE", false),
        new Idol(3, "ASEPA", false),
        new Idol(2, "NEWJENS", false),
      ],
    };
  },
};
</script>
