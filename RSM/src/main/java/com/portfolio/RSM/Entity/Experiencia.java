
package com.portfolio.RSM.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Experiencia {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String nombreTrabajo;
    private String fechaTrabajo;
    private String descripcionTrabajo;
    private String logoTrabajo;

    public Experiencia() {
    }

    public Experiencia(String nombreTrabajo, String descripcionTrabajo, String fechaTrabajo, String logoTrabajo) {
        this.nombreTrabajo = nombreTrabajo;
        this.descripcionTrabajo = descripcionTrabajo;
        this.fechaTrabajo = fechaTrabajo;
        this.logoTrabajo = logoTrabajo;
    }
    
}
