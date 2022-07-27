package com.proyectofinal.portfolio.service;

import com.proyectofinal.portfolio.exception.UserNotFoundException;
import com.proyectofinal.portfolio.model.Proyectos;
import com.proyectofinal.portfolio.repo.ProyectosRepo;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ProyectosService {
    private final ProyectosRepo proyectosRepo;
    
    @Autowired
    public ProyectosService(ProyectosRepo proyectosRepo) {
        this.proyectosRepo = proyectosRepo;
    }
    
    public Proyectos addProyectos(Proyectos proyectos) {
        return proyectosRepo.save(proyectos);
    }
                
    public List<Proyectos> findAllProyectos() {
        return proyectosRepo.findAll();
    }
    
    public Proyectos updateProyectos(Proyectos  proyectos) {
        return proyectosRepo.save( proyectos);
    }
    
    public Proyectos findProyectosById(Long id) {
        return proyectosRepo.findProyectosById(id)
                .orElseThrow(() -> new UserNotFoundException ("La id " + id + " no se encuentra"));
    }
    
    public void deleteProyectos(Long id) {
        proyectosRepo.deleteProyectosById(id);
    }
}
