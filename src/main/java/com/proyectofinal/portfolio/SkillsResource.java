package com.proyectofinal.portfolio;

import com.proyectofinal.portfolio.model.Skills;
import com.proyectofinal.portfolio.service.SkillsService;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/skills")


public class SkillsResource {
    private final SkillsService skillsService;
    
    public SkillsResource(SkillsService skillsService) {
        this.skillsService = skillsService;
    }  
    
    @GetMapping("/all")
    public ResponseEntity<List<Skills>> getAllSkills () {
        List<Skills> skills = skillsService.findAllSkills();
        return new ResponseEntity<>(skills,HttpStatus.OK);
    }
    
    @GetMapping("/find/{id}")
    public ResponseEntity<Skills> getSkillsById (@PathVariable("id") Long id) {
        Skills skills = skillsService.findSkillsById(id);
        return new ResponseEntity<>(skills,HttpStatus.OK);
    }
    
    @PostMapping("/add")
    public ResponseEntity<Skills> addSkills(@RequestBody Skills skills) {
        Skills newSkills = skillsService.addSkills(skills);
        return new ResponseEntity<>(newSkills, HttpStatus.CREATED);
    }
    
    @PutMapping("/update")
    public ResponseEntity<Skills> updateSkills(@RequestBody Skills skills) {
        Skills updateSkills = skillsService.addSkills(skills);
        return new ResponseEntity<>(updateSkills, HttpStatus.OK);
    }
    
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteSkills(@PathVariable ("id") Long id) {
        skillsService.deleteSkills(id);
        return new ResponseEntity<>(HttpStatus.OK);
    } 
    
}
