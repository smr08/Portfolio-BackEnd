
package com.portfolio.RSM.Interface;

import com.portfolio.RSM.Entity.Experiencia;
import java.util.List;


public interface IExperienciaService {
    public List<Experiencia> mostrarExperiencias();
    
    public void agregarExperiencia(Experiencia exp);
    
    public void borrarExperiencia(long id);
    
    public Experiencia buscarExperiencia(long id);
    
    public void editarExperiencia(Experiencia exp);
    
}
