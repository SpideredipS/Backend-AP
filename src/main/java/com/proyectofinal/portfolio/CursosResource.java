package com.proyectofinal.portfolio;

import com.proyectofinal.portfolio.model.Cursos;
import com.proyectofinal.portfolio.service.CursosService;
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
@RequestMapping("/cursos")
public class CursosResource {
    private final CursosService cursosService;
    
    public CursosResource(CursosService cursosService) {
        this.cursosService = cursosService;
    }  
    
    @GetMapping("/all")
    public ResponseEntity<List<Cursos>> getAllCursos () {
        List<Cursos> cursos = cursosService.findAllCursos();
        return new ResponseEntity<>(cursos,HttpStatus.OK);
    }
    
    @GetMapping("/find/{id}")
    public ResponseEntity<Cursos> getCursosById (@PathVariable("id") Long id) {
        Cursos cursos = cursosService.findCursosById(id);
        return new ResponseEntity<>(cursos,HttpStatus.OK);
    }
    
    @PostMapping("/add")
    public ResponseEntity<Cursos> addCursos(@RequestBody Cursos cursos) {
        Cursos newCursos = cursosService.addCursos(cursos);
        return new ResponseEntity<>(newCursos, HttpStatus.CREATED);
    }
    
    @PutMapping("/update")
    public ResponseEntity<Cursos> updateCursos(@RequestBody Cursos cursos) {
        Cursos updateCursos = cursosService.addCursos(cursos);
        return new ResponseEntity<>(updateCursos, HttpStatus.OK);
    }
    
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteCursos(@PathVariable ("id") Long id) {
        cursosService.deleteCursos(id);
        return new ResponseEntity<>(HttpStatus.OK);
    } 
    
}
