<template>
  <div>
    <h2>관심있는 K-POP 가수는?</h2>
    <hr />
    <ul>
      <CheckboxItem
        v-for="idol in idol"
        :key="idol.id"
        :name="idol.name"
        :checked="idol.checked"
      />
    </ul>
  </div>
</template>

<script>
import CheckboxItem from "./components/CheckboxItem.vue";
export default {
  name: "App",
  components: { CheckboxItem },
  data() {
    return {
      idols: [
        { id: 1, name: "BTS", checked: true },
        { id: 2, name: "BLACK PINK", checked: false },
        { id: 3, name: "ASEPA", checked: false },
        { id: 4, name: "SEVENTEEN", checked: false },
      ],
    };
  },
};
</script>
