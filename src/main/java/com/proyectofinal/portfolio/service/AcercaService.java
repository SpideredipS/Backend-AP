package com.proyectofinal.portfolio.service;

import com.proyectofinal.portfolio.exception.UserNotFoundException;
import com.proyectofinal.portfolio.model.Acerca;
import com.proyectofinal.portfolio.repo.AcercaRepo;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service 
@Transactional
public class AcercaService {
    private final AcercaRepo acercaRepo;
    
    @Autowired
    public AcercaService(AcercaRepo acercaRepo) {
        this.acercaRepo = acercaRepo;
    }
    
    public Acerca addAcerca(Acerca acerca) {
        return acercaRepo.save(acerca);
    }
                
    public List<Acerca> findAllAcercas() {
        return acercaRepo.findAll();
    }
    
    public Acerca updateAcerca(Acerca acerca) {
        return acercaRepo.save(acerca);
    }
    
    public Acerca findAcercaById(Long id) {
        return acercaRepo.findAcercaById(id)
                .orElseThrow(() -> new UserNotFoundException ("La id " + id + " no se encuentra"));
    }
    
    public void deleteAcerca(Long id) {
        acercaRepo.deleteAcercaById(id);
    }
}
