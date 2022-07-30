package com.proyectofinal.portfolio;

import com.proyectofinal.portfolio.model.Educacion;
import com.proyectofinal.portfolio.service.EducacionService;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/educacion")
public class EducacionResource {
    private final EducacionService educacionService;
    
    public EducacionResource(EducacionService educacionService) {
        this.educacionService = educacionService;
    }  
    
    @GetMapping("/all")
    public ResponseEntity<List<Educacion>> getAllEducacion () {
        List<Educacion> educacion = educacionService.findAllEducacion();
        return new ResponseEntity<>(educacion,HttpStatus.OK);
    }
    
    @GetMapping("/find/{id}")
    public ResponseEntity<Educacion> getEducacionById (@PathVariable("id") Long id) {
        Educacion educacion = educacionService.findEducacionById(id);
        return new ResponseEntity<>(educacion,HttpStatus.OK);
    }
    
    @PostMapping("/add")
    public ResponseEntity<Educacion> addEducacion(@RequestBody Educacion educacion) {
        Educacion newEducacion = educacionService.addEducacion(educacion);
        return new ResponseEntity<>(newEducacion, HttpStatus.CREATED);
    }
    
    @PutMapping("/update")
    public ResponseEntity<Educacion> updateEducacion(@RequestBody Educacion educacion) {
        Educacion updateEducacion = educacionService.addEducacion(educacion);
        return new ResponseEntity<>(updateEducacion, HttpStatus.OK);
    }
    
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteEducacion(@PathVariable ("id") Long id) {
        educacionService.deleteEducacion(id);
        return new ResponseEntity<>(HttpStatus.OK);
    } 
    
}

    

