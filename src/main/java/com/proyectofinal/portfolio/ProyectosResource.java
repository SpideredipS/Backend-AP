package com.proyectofinal.portfolio;

import com.proyectofinal.portfolio.model.Proyectos;
import com.proyectofinal.portfolio.service.ProyectosService;
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
@RequestMapping("/proyectos")

public class ProyectosResource {
    private final ProyectosService proyectosService;
    
    public ProyectosResource(ProyectosService proyectosService) {
        this.proyectosService = proyectosService;
    }  
    
    @GetMapping("/all")
    public ResponseEntity<List<Proyectos>> getAllProyectos () {
        List<Proyectos> proyectos = proyectosService.findAllProyectos();
        return new ResponseEntity<>(proyectos,HttpStatus.OK);
    }
    
    @GetMapping("/find/{id}")
    public ResponseEntity<Proyectos> getProyectosById (@PathVariable("id") Long id) {
        Proyectos proyectos = proyectosService.findProyectosById(id);
        return new ResponseEntity<>(proyectos,HttpStatus.OK);
    }
    
    @PostMapping("/add")
    public ResponseEntity<Proyectos> addProyectos(@RequestBody Proyectos proyectos) {
        Proyectos newProyectos = proyectosService.addProyectos(proyectos);
        return new ResponseEntity<>(newProyectos, HttpStatus.CREATED);
    }
    
    @PutMapping("/update")
    public ResponseEntity<Proyectos> updateProyectos(@RequestBody Proyectos proyectos) {
        Proyectos updateProyectos = proyectosService.addProyectos(proyectos);
        return new ResponseEntity<>(updateProyectos, HttpStatus.OK);
    }
    
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteProyectos(@PathVariable ("id") Long id) {
        proyectosService.deleteProyectos(id);
        return new ResponseEntity<>(HttpStatus.OK);
    } 
    
}
