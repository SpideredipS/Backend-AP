package com.proyectofinal.portfolio.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity 
public class Acerca implements Serializable {
    @Id 
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String descripcion1;
    private String descripcion2;
    private String descripcion3;
    private String imageUrl;
    
    public Acerca() {}
    
    public Acerca(String descripcion1, String descripcion2, String descripcion3, String imageUrl){
        this.descripcion1 = descripcion1;
        this.descripcion2 = descripcion2;
        this.descripcion3 = descripcion3;
        this.imageUrl = imageUrl;
    }
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public String getDescripcion1() {
        return descripcion1;
    }
    
    public void setDescripcion1(String descripcion1){
        this.descripcion1 = descripcion1;
    }
    
    public String getDescripcion2 () {
        return descripcion2;
    }
    
    public void setDescripcion2(String descripcion2){
        this.descripcion2 = descripcion2;
    }
    
    public String getDescripcion3 () {
        return descripcion3;
    }
    
    public void setDescripcion3(String descripcion3 ){
        this.descripcion3 = descripcion3;
    }
    public String getImageUrl() {
        return imageUrl;
    }
    
    public void setImageUrl(String imageUrl){
        this.imageUrl = imageUrl;
    }
    
}
