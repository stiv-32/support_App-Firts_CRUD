package Proyect.Backend_SupportApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import Proyect.Backend_SupportApp.model.Persona;

public interface Repository extends JpaRepository<Persona, Long> {
    
}
