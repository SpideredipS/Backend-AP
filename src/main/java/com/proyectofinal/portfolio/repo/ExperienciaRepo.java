package com.proyectofinal.portfolio.repo;

import com.proyectofinal.portfolio.model.Experiencia;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExperienciaRepo extends JpaRepository<Experiencia, Long> {
    void deleteExperienciaById(Long id);

    Optional<Experiencia> findExperienciaById(Long id);
    
}
