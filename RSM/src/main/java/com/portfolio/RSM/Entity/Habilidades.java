
package com.portfolio.RSM.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Habilidades {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String nombreHabilidad;
    private String porcentajeHaabilidad;
    private String logoHabilidad;

    public Habilidades() {
    }

    public Habilidades(String nombreHabilidad, String porcentajeHaabilidad, String logoHabilidad) {
        this.nombreHabilidad = nombreHabilidad;
        this.porcentajeHaabilidad = porcentajeHaabilidad;
        this.logoHabilidad = logoHabilidad;
    }
    
    
}
