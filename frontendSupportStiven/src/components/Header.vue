<script setup>
import "bootstrap/dist/css/bootstrap.min.css";
import 'bootstrap/dist/js/bootstrap.bundle.min.js';
</script>

<template>
  
   <nav class="navbar bg-dark border-bottom border-body" data-bs-theme="dark">
  <div class="container-fluid ">
    <router-link class="navbar-brand fs-6" to="/">Home</router-link>
    <router-link class="navbar-brand fs-6" to="/ListSol">Formato</router-link>
    <router-link class="navbar-brand fs-6" to="/RequestEdit">Editar</router-link>
    <router-link class="navbar-brand fs-6" to="/EditInf">Nueva Solicitud</router-link>
    
    <button class="navbar-toggler p-1" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
      <div class="navbar-nav">
        <a class="nav-link active fs-6" aria-current="page" href="#">Formato</a>
        <a class="nav-link fs-6" href="#">Editar</a>
        <a class="nav-link disabled fs-6" aria-disabled="true">Solicitud</a>
      </div>
    </div>
  </div>
</nav>
</template>

<style scope>


</style>