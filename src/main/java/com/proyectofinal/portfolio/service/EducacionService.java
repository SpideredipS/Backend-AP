package com.proyectofinal.portfolio.service;

import com.proyectofinal.portfolio.exception.UserNotFoundException;
import com.proyectofinal.portfolio.model.Educacion;
import com.proyectofinal.portfolio.repo.EducacionRepo;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service 
@Transactional
public class EducacionService {
    private final EducacionRepo educacionRepo;
    
    @Autowired
    public EducacionService(EducacionRepo educacionRepo) {
        this.educacionRepo = educacionRepo;
    }
    
    public Educacion addEducacion(Educacion educacion) {
        return educacionRepo.save(educacion);
    }
                
    public List<Educacion> findAllEducacion() {
        return educacionRepo.findAll();
    }
    
    public Educacion updateEducacion(Educacion educacion) {
        return educacionRepo.save(educacion);
    }
    
    public Educacion findEducacionById(Long id) {
        return educacionRepo.findEducacionById(id)
                .orElseThrow(() -> new UserNotFoundException ("La id " + id + " no se encuentra"));
    }
    
    public void deleteEducacion(Long id) {
        educacionRepo.deleteEducacionById(id);
    }
}

