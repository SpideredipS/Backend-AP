package com.proyectofinal.portfolio.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Skills implements Serializable {
    @Id 
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String skill;
    private String porcentaje;
        
    public Skills() {}
    
    public Skills(String skill, String porcentaje){
        this.skill  = skill;
        this.porcentaje = porcentaje;
    }
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public String getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(String porcentaje) {
        this.porcentaje = porcentaje;
    }

    
}
