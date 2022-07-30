package com.proyectofinal.portfolio.service;

import com.proyectofinal.portfolio.exception.UserNotFoundException;
import com.proyectofinal.portfolio.model.Skills;
import com.proyectofinal.portfolio.repo.SkillsRepo;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service 
@Transactional
public class SkillsService {
    private final SkillsRepo skillsRepo;
    
    @Autowired
    public SkillsService(SkillsRepo skillsRepo) {
        this.skillsRepo = skillsRepo;
    }
    
    public Skills addSkills(Skills Skills) {
        return skillsRepo.save(Skills);
    }
                
    public List<Skills> findAllSkills() {
        return skillsRepo.findAll();
    }
    
    public Skills updateSkills(Skills skills) {
        return skillsRepo.save(skills);
    }
    
    public Skills findSkillsById(Long id) {
        return skillsRepo.findSkillsById(id)
                .orElseThrow(() -> new UserNotFoundException ("La id " + id + " no se encuentra"));
    }
    
    public void deleteSkills(Long id) {
        skillsRepo.deleteSkillsById(id);
    }
}
