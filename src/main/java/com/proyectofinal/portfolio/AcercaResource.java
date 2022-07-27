package com.proyectofinal.portfolio;

import com.proyectofinal.portfolio.model.Acerca;
import com.proyectofinal.portfolio.service.AcercaService;
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
@RequestMapping("/acerca")
public class AcercaResource {
    private final AcercaService acercaService;
    
    public AcercaResource(AcercaService acercaService) {
        this.acercaService = acercaService;
    }  
    
    @GetMapping("/all")
    public ResponseEntity<List<Acerca>> getAllAcercas () {
        List<Acerca> acercas = acercaService.findAllAcercas();
        return new ResponseEntity<>(acercas,HttpStatus.OK);
    }
    
    @GetMapping("/find/{id}")
    public ResponseEntity<Acerca> getAcercaById (@PathVariable("id") Long id) {
        Acerca acerca = acercaService.findAcercaById(id);
        return new ResponseEntity<>(acerca,HttpStatus.OK);
    }
    
    @PostMapping("/add")
    public ResponseEntity<Acerca> addAcerca(@RequestBody Acerca acerca) {
        Acerca newAcerca = acercaService.addAcerca(acerca);
        return new ResponseEntity<>(newAcerca, HttpStatus.CREATED);
    }
    
    @PutMapping("/update")
    public ResponseEntity<Acerca> updateAcerca(@RequestBody Acerca acerca) {
        Acerca updateAcerca = acercaService.addAcerca(acerca);
        return new ResponseEntity<>(updateAcerca, HttpStatus.OK);
    }
    
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteAcerca(@PathVariable ("id") Long id) {
        acercaService.deleteAcerca(id);
        return new ResponseEntity<>(HttpStatus.OK);
    } 
}