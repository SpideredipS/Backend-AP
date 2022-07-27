package com.proyectofinal.portfolio.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Experiencia implements Serializable {
    @Id 
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String empresa;
    private String area;
    private String puesto;
    private String periodo;
    private String tareas;
    private String imageUrl;
    
    public Experiencia() {}
    
    public Experiencia(String empresa, String area, String puesto, String periodo, String tareas, String imageUrl){
        this.empresa = empresa;
        this.area = area;
        this.periodo = periodo;
        this.tareas = tareas;
        this.imageUrl = imageUrl;
    }
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public String getEmpresa () {
        return empresa;
    }
    
    public void setEmpresa(String empresa){
        this.empresa = empresa;
    }
    
    public String getArea () {
        return area;
    }
    
    public void setArea(String area){
        this.area = area;
    }
    
     public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
    
    public String getPeriodo () {
        return periodo;
    }
    
    public void setPeriodo (String periodo ){
        this.periodo = periodo;
    }

    public String getTareas() {
        return tareas;
    }

    public void setTareas(String tareas) {
        this.tareas = tareas;
    }
    
    public String getImageUrl() {
        return imageUrl;
    }
    
    public void setImageUrl(String imageUrl){
        this.imageUrl = imageUrl;
    }

       
}

