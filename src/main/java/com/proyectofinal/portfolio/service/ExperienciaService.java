package com.proyectofinal.portfolio.service;

import com.proyectofinal.portfolio.exception.UserNotFoundException;
import com.proyectofinal.portfolio.model.Experiencia;
import com.proyectofinal.portfolio.repo.ExperienciaRepo;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service 
@Transactional
public class ExperienciaService {
    private final ExperienciaRepo experienciaRepo;
    
    @Autowired
    public ExperienciaService(ExperienciaRepo experienciaRepo) {
        this.experienciaRepo = experienciaRepo;
    }
    
    public Experiencia addExperiencia(Experiencia experiencia) {
        return experienciaRepo.save(experiencia);
    }
                
    public List<Experiencia> findAllExperiencia() {
        return experienciaRepo.findAll();
    }
    
    public Experiencia updateExperiencia(Experiencia experiencia) {
        return experienciaRepo.save(experiencia);
    }
    
    public Experiencia findExperienciaById(Long id) {
        return experienciaRepo.findExperienciaById(id)
                .orElseThrow(() -> new UserNotFoundException ("La id " + id + " no se encuentra"));
    }
    
    public void deleteExperiencia(Long id) {
        experienciaRepo.deleteExperienciaById(id);
    }
}
