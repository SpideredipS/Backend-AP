package com.proyectofinal.portfolio.repo;

import com.proyectofinal.portfolio.model.Proyectos;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProyectosRepo extends JpaRepository<Proyectos, Long> {
    void deleteProyectosById(Long id);

    Optional<Proyectos> findProyectosById(Long id);
    
}