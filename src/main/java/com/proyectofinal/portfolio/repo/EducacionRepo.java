package com.proyectofinal.portfolio.repo;

import com.proyectofinal.portfolio.model.Educacion;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EducacionRepo extends JpaRepository<Educacion, Long> {
    void deleteEducacionById(Long id);

    Optional<Educacion> findEducacionById(Long id);
    
}
