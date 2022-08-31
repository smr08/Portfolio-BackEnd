
package com.portfolio.RSM.Interface;

import com.portfolio.RSM.Entity.Habilidades;
import java.util.List;


public interface IHabilidadesService {
    
    public List<Habilidades> mostrarHabilidad();
    
    public void agregarHabilidad(Habilidades habilidad);
    
    public void borrarHabilidad(long id);
    
    public Habilidades buscarHabilidad(long id);
    
    public void editarHabilidad(Habilidades habilidad);
}
