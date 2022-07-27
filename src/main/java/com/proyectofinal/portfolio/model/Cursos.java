package com.proyectofinal.portfolio.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Cursos implements Serializable {
    @Id 
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String establecimiento;
    private String curso;
    private String imageUrl;
    
    public Cursos() {}
    
    public Cursos(String establecimiento, String curso, String imageUrl){
        this.establecimiento = establecimiento;
        this.curso = curso;
        this.imageUrl = imageUrl;
    }
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public String getEstablecimiento() {
        return establecimiento;
    }

    public void setEstablecimiento(String establecimiento) {
        this.establecimiento = establecimiento;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso1(String curso) {
        this.curso = curso;
    }
    
    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
    
    


    
}
