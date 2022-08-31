
package com.portfolio.RSM.Service;

import com.portfolio.RSM.Entity.Educacion;
import com.portfolio.RSM.Interface.IEducacionService;
import com.portfolio.RSM.Repository.EducacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EducacionService implements IEducacionService {
    @Autowired
    private EducacionRepository educacionRepositori;

    @Override
    public List<Educacion> mostrarEducacion() {
       return educacionRepositori.findAll();
    }

    @Override
    public void agregarEducacion(Educacion edu) {
       educacionRepositori.save(edu);
    }

    @Override
    public void borrarEducacion(long id) {
       educacionRepositori.deleteById(id);
    }

    @Override
    public Educacion buscarEducacion(long id) {
       return educacionRepositori.findById(id).orElse(null);
    }

    @Override
    public void editarEducacion(Educacion edu) {
        educacionRepositori.save(edu);
    }
    
}
