
package com.portfolio.RSM.Service;

import com.portfolio.RSM.Entity.Habilidades;
import com.portfolio.RSM.Interface.IHabilidadesService;
import com.portfolio.RSM.Repository.HabilidadesRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HabilidadesService implements IHabilidadesService {
    
    @Autowired
    private HabilidadesRepository habilidadesRepository;

    @Override
    public List<Habilidades> mostrarHabilidad() {
        return habilidadesRepository.findAll();
    }

    @Override
    public void agregarHabilidad(Habilidades habilidad) {
        habilidadesRepository.save(habilidad);
    }

    @Override
    public void borrarHabilidad(long id) {
        habilidadesRepository.deleteById(id);
    }

    @Override
    public Habilidades buscarHabilidad(long id) {
        return habilidadesRepository.findById(id).orElse(null);  
    }

    @Override
    public void editarHabilidad(Habilidades habilidad) {
        habilidadesRepository.save(habilidad);
    }
    
}
