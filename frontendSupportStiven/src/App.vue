<script setup>
import { RouterLink, RouterView } from 'vue-router'
import "bootstrap/dist/css/bootstrap.min.css";
import 'bootstrap/dist/js/bootstrap.bundle.min.js';
import Header from './components/Header.vue';
</script>

<template>
<Header/>

<RouterView/>
  
</template>

<style scoped>

</style>
