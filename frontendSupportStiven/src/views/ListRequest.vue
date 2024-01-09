<script>
import "bootstrap/dist/css/bootstrap.min.css";
import 'bootstrap/dist/js/bootstrap.bundle.min.js';
</script>

<template>
   <main>
    <h2 class="text-center bg-success">Formulario de Solicitudes</h2>
        <div class="mb-3 p-1">
      <label for="exampleFormControlInput1" class="form-label">Nombre</label>
      <input type="email" class="form-control" id="exampleFormControlInput1" >
      </div>

      <div class="mb-3 p-1">
      <label for="exampleFormControlInput1" class="form-label">Fecha</label>
      <input type="email" class="form-control" id="exampleFormControlInput1" >
      </div>

      <div class="mb-3 p-1">
      <label for="exampleFormControlInput1" class="form-label">Tipo de Consulta</label>
      <input type="email" class="form-control" id="exampleFormControlInput1" >
      </div>
      
       <div class="mb-3 p-1">
       <label for="exampleFormControlTextarea1" class="form-label">Solicitud</label>
       <textarea class="form-control" id="exampleFormControlTextarea1" rows="5"></textarea>
        </div>
        <button type="button" class="btn btn-dark">Enviar</button>
    </main>
</template>

<style scope>

</style>