package com.proyectofinal.portfolio.repo;

import com.proyectofinal.portfolio.model.Login;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginRepo extends JpaRepository<Login, Long>{
    List<Login> findByNombre(String nombre);
}
