
package com.portfolio.RSM.Service;

import com.portfolio.RSM.Entity.Experiencia;
import com.portfolio.RSM.Interface.IExperienciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.portfolio.RSM.Repository.ExperienciaRepository;
import java.util.List;

@Service
public class ExperienciaService implements IExperienciaService{
   @Autowired
    private ExperienciaRepository experienciaRepositori;
   
   @Override
    public List<Experiencia> mostrarExperiencias() {
        return experienciaRepositori.findAll();
    }

   @Override
    public void agregarExperiencia(Experiencia exp) {
        experienciaRepositori.save(exp);
    }

   @Override
    public void borrarExperiencia(long id) {
        experienciaRepositori.deleteById(id);
    }

   @Override
    public Experiencia buscarExperiencia(long id) {
        return experienciaRepositori.findById(id).orElse(null);
    }

   @Override
    public void editarExperiencia(Experiencia exp) {
        experienciaRepositori.save(exp);
    }
    
    
    
    
}
