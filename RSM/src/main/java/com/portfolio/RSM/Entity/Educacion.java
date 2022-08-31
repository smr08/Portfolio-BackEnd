
package com.portfolio.RSM.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Educacion {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String lugarEstudio;
    private String nombreEstudio;
    private String descripcionEstudio;
    private String logoEstudio;

    public Educacion() {
    }

    public Educacion(String lugarEstudio, String nombreEstudio, String descripcionEstudio, String logoEstudio) {
        this.lugarEstudio = lugarEstudio;
        this.nombreEstudio = nombreEstudio;
        this.descripcionEstudio = descripcionEstudio;
        this.logoEstudio = logoEstudio;
    }
    
    
    
}
