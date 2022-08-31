
package com.portfolio.RSM.Controller;

import com.portfolio.RSM.Entity.AcercaDeMi;
import com.portfolio.RSM.Interface.IAcercaDeMiService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/acercademi")
@CrossOrigin(origins="http://localhost:4200")
public class AcercaDeMiController {
    
    @Autowired
    private IAcercaDeMiService iAcercaDeMiService;
    
    @GetMapping("/traer")
    @ResponseBody
    public List<AcercaDeMi> mostrarAcercaDeMi(){
        return iAcercaDeMiService.mostrarAcercaDeMi();
    }
    
     @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/crear")
    public void agregarAcercaDeMi(@RequestBody AcercaDeMi acercaDeMi){
        iAcercaDeMiService.agregarAcercaDeMi(acercaDeMi);
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/editar")
    public void editarAcercaDeMi(@RequestBody AcercaDeMi acercaDeMi){
        iAcercaDeMiService.editarAcercaDeMi(acercaDeMi);
    }
    
    @GetMapping("/buscar/{id}")
    @ResponseBody
    public AcercaDeMi buscarAcercaDeMi(@PathVariable long id){
        return iAcercaDeMiService.buscarAcercaDeMi(id);
    }
    
}
