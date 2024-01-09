package Proyect.Backend_SupportApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import Proyect.Backend_SupportApp.model.Persona;
import Proyect.Backend_SupportApp.repository.Repository;


@RestController
public class controlPersona {
    
    @Autowired
    private Repository repository;

    @GetMapping()
    public String index(){
        return "conections";
    }

    @GetMapping("personas")
    public List<Persona> getPersonas(){
        return repository.findAll();  
    }

    @PostMapping("grabar")
    public String post(@RequestBody Persona persona){
        repository.save(persona);
        return "grabado";
    }

    @PutMapping("editar/{id}")
    public String update(@PathVariable Long id, @RequestBody Persona persona){
    Persona updatePersona = repository.findById(id).get();
    updatePersona.setUsername(persona.getUsername());
    updatePersona.setPassword(persona.getPassword());
    repository.save(updatePersona);
    return"editado correctamente";
    }
}

   