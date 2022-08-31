
package com.portfolio.RSM.Service;

import com.portfolio.RSM.Entity.Proyectos;
import com.portfolio.RSM.Interface.IProyectoService;
import com.portfolio.RSM.Repository.ProyectoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProyectoService implements IProyectoService {
    @Autowired
    private ProyectoRepository proyectoRepository;

    @Override
    public List<Proyectos> mostrarProyecto() {
       return proyectoRepository.findAll();
    }

    @Override
    public void agregarProyecto(Proyectos proye) {
       proyectoRepository.save(proye); 
    }

    @Override
    public void borrarProyecto(long id) {
       proyectoRepository.deleteById(id);
    }

    @Override
    public Proyectos buscarProyecto(long id) {
       return proyectoRepository.findById(id).orElse(null); 
    }

    @Override
    public void editarProyecto(Proyectos proye) {
        proyectoRepository.save(proye);  
    }
    
}
