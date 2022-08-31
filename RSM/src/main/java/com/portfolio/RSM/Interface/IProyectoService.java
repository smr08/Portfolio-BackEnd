
package com.portfolio.RSM.Interface;

import com.portfolio.RSM.Entity.Proyectos;
import java.util.List;


public interface IProyectoService {
    
    public List<Proyectos> mostrarProyecto();
    
    public void agregarProyecto(Proyectos proye);
    
    public void borrarProyecto(long id);
    
    public Proyectos buscarProyecto(long id);
    
    public void editarProyecto(Proyectos proye);
    
}
