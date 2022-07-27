package com.proyectofinal.portfolio.service;

import com.proyectofinal.portfolio.exception.UserNotFoundException;
import com.proyectofinal.portfolio.model.Cursos;
import com.proyectofinal.portfolio.repo.CursosRepo;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service 
@Transactional
public class CursosService {
    private final CursosRepo cursosRepo;
    
    @Autowired
    public CursosService(CursosRepo cursosRepo) {
        this.cursosRepo = cursosRepo;
    }
    
    public Cursos addCursos(Cursos cursos) {
        return cursosRepo.save(cursos);
    }
                
    public List<Cursos> findAllCursos() {
        return cursosRepo.findAll();
    }
    
    public Cursos updateCursos(Cursos cursos) {
        return cursosRepo.save(cursos);
    }
    
    public Cursos findCursosById(Long id) {
        return cursosRepo.findCursosById(id)
                .orElseThrow(() -> new UserNotFoundException ("La id " + id + " no se encuentra"));
    }
    
    public void deleteCursos(Long id) {
        cursosRepo.deleteCursosById(id);
    }
}

