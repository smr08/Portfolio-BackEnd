
package com.portfolio.RSM.Interface;

import com.portfolio.RSM.Entity.Persona;
import java.util.List;


public interface IPersonaService {
    public List<Persona> getPersona();
    
    public void savePersona (Persona persona);
    
    public void deletePersona(Long id);
    
    public Persona findPerona(Long id);
   
    public void editPersona(Persona pers);
}
