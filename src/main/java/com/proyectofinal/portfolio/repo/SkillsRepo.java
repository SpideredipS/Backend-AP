package com.proyectofinal.portfolio.repo;

import com.proyectofinal.portfolio.model.Skills;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SkillsRepo extends JpaRepository<Skills, Long> {
    void deleteSkillsById(Long id);

    Optional<Skills> findSkillsById(Long id);
    
}