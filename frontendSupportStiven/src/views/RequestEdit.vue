<script>
import "bootstrap/dist/css/bootstrap.min.css";
import 'bootstrap/dist/js/bootstrap.bundle.min.js';
</script>

<template>
    <main>
    <h2 class="text-center bg-success">Informacion de Solicitud</h2>
        <div class="mb-3 p-1">
      <label for="exampleFormControlInput1" class="form-label">Incidencia</label>
      <input type="email" class="form-control" id="exampleFormControlInput1" >
      </div>

      <div class="mb-3 p-1">
      <label for="exampleFormControlInput1" class="form-label">Empleado que solicita</label>
      <input type="email" class="form-control" id="exampleFormControlInput1" >
      </div>

      <div class="mb-3 p-1">
      <label for="exampleFormControlInput1" class="form-label">Tipo de Consulta</label>
      <input type="email" class="form-control" id="exampleFormControlInput1" >
      </div>
      
       <div class="mb-3 p-1">
       <label for="exampleFormControlTextarea1" class="form-label">Departamento Encargado</label>
       <input type="email" class="form-control" id="exampleFormControlInput1" >
        </div>
        <textarea class="form-control" id="exampleFormControlTextarea1" rows="5">Equipo fallando en su sofware</textarea>
    </main>
    <section class="d-flex justify-content-around m-2">
        <button type="button" class="btn btn-danger">Validar</button>
        <button type="button" class="btn btn-dark">Cancel</button>
        <button type="button" class="btn btn-danger">Reset</button>
    </section>
</template>

<style scope>

</style>