package com.proyectofinal.portfolio.repo;

import com.proyectofinal.portfolio.model.Acerca;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AcercaRepo extends JpaRepository<Acerca, Long> {
    void deleteAcercaById(Long id);

    Optional<Acerca> findAcercaById(Long id);
}
