package com.proyectofinal.portfolio.repo;

import com.proyectofinal.portfolio.model.Cursos;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CursosRepo extends JpaRepository<Cursos, Long> {
    void deleteCursosById(Long id);

    Optional<Cursos> findCursosById(Long id);
    
}
