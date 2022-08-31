
package com.portfolio.RSM.Service;

import com.portfolio.RSM.Entity.AcercaDeMi;
import com.portfolio.RSM.Interface.IAcercaDeMiService;
import com.portfolio.RSM.Repository.AcercaDeMiRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AcercaDeMiServise implements IAcercaDeMiService {
    
    @Autowired
    private AcercaDeMiRepository acercaDeMiRepository;

    @Override
    public List<AcercaDeMi> mostrarAcercaDeMi() {
        return acercaDeMiRepository.findAll();
    }
    
    @Override
    public void agregarAcercaDeMi(AcercaDeMi acercaDeMi) {
       acercaDeMiRepository.save(acercaDeMi);
    }

    @Override
    public AcercaDeMi buscarAcercaDeMi(long id) {
        return acercaDeMiRepository.findById(id).orElse(null);
    }

    @Override
    public void editarAcercaDeMi(AcercaDeMi acercaDeMi) {
        acercaDeMiRepository.save(acercaDeMi);
    }
    
}
