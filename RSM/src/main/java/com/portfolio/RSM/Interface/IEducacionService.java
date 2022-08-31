
package com.portfolio.RSM.Interface;

import com.portfolio.RSM.Entity.Educacion;
import java.util.List;


public interface IEducacionService {
    
    public List<Educacion> mostrarEducacion();
    
    public void agregarEducacion(Educacion edu);
    
    public void borrarEducacion(long id);
    
    public Educacion buscarEducacion(long id);
    
    public void editarEducacion(Educacion edu);
}
