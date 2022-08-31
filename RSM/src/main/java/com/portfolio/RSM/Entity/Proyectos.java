
package com.portfolio.RSM.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Proyectos {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String nombreProyecto;
    private String descripcionProyecto;
    private String imgProyecto;
    private String linkProyecto;

    public Proyectos() {
    }

    public Proyectos(String nombreProyecto, String descripcionProyecto, String imgProyecto, String linkProyecto) {
        this.nombreProyecto = nombreProyecto;
        this.descripcionProyecto = descripcionProyecto;
        this.imgProyecto = imgProyecto;
        this.linkProyecto = linkProyecto;
    }
    
    
    
}
