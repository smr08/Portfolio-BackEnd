
package com.portfolio.RSM.Controller;

import com.portfolio.RSM.Entity.Habilidades;
import com.portfolio.RSM.Interface.IHabilidadesService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/habilidades")
@CrossOrigin(origins="https://portfoliosofiarossi.web.app")
public class HabilidadesController {
   @Autowired
    private IHabilidadesService iHabilidadesService; 
   
   @GetMapping("/traer")
   @ResponseBody
    public List<Habilidades> mostrarHabilidad(){
        return iHabilidadesService.mostrarHabilidad();
    }
   
   @PreAuthorize("hasRole('ADMIN')")
   @PostMapping("/crear")
    public void agregarHabilidad(@RequestBody Habilidades habilidad){
        iHabilidadesService.agregarHabilidad(habilidad);
    }
   
   @PreAuthorize("hasRole('ADMIN')")
   @PutMapping("/editar")
    public void editarHabilidad(@RequestBody Habilidades habilidad){
        iHabilidadesService.editarHabilidad(habilidad);
    }
    
   @GetMapping("/buscar/{id}")
   @ResponseBody
    public Habilidades buscarHabilidad(@PathVariable long id){
        return iHabilidadesService.buscarHabilidad(id);
    }
   
   @PreAuthorize("hasRole('ADMIN')")
   @DeleteMapping("/borrar/{id}")
    public void borrarHabilidad(@PathVariable long id){
        iHabilidadesService.borrarHabilidad(id);
    }
}
