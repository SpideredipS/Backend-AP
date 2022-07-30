package com.proyectofinal.portfolio.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Educacion implements Serializable {
    @Id 
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String establecimiento;
    private String titulo;
    private String periodo;
    private String imageUrl;
    
    public Educacion() {}
    
    public Educacion(String establecimiento, String titulo, String periodo, String imageUrl){
        this.establecimiento = establecimiento;
        this.titulo = titulo;
        this.periodo = periodo;
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
    
    public void setEstablecimiento(String establecimiento){
        this.establecimiento = establecimiento;
    }
    
    public String getTitulo () {
        return titulo;
    }
    
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    
    public String getPeriodo () {
        return periodo;
    }
    
    public void setPeriodo(String periodo ){
        this.periodo = periodo;
    }
    public String getImageUrl() {
        return imageUrl;
    }
    
    public void setImageUrl(String imageUrl){
        this.imageUrl = imageUrl;
    }
    
}

