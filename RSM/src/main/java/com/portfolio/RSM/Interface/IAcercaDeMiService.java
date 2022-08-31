
package com.portfolio.RSM.Interface;

import com.portfolio.RSM.Entity.AcercaDeMi;
import java.util.List;


public interface IAcercaDeMiService {
    
    public List<AcercaDeMi> mostrarAcercaDeMi();
    
    public void agregarAcercaDeMi(AcercaDeMi acercaDeMi);
    
    public AcercaDeMi buscarAcercaDeMi(long id);
    
    public void editarAcercaDeMi(AcercaDeMi acercaDeMi);
    
}
