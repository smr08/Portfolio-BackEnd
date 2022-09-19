
package com.portfolio.RSM.Controller;

import com.portfolio.RSM.Entity.Proyectos;
import com.portfolio.RSM.Interface.IProyectoService;
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
@RequestMapping("/proyectos")
@CrossOrigin(origins="https://portfoliosofiarossi.web.app")
public class ProyectoController {
    
    @Autowired
    private IProyectoService iProyectoService;
    
    @GetMapping("/traer")
    @ResponseBody
    public List<Proyectos> mostrarProyecto(){
        return iProyectoService.mostrarProyecto();
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/crear")
    public void agregarProyecto(@RequestBody Proyectos proye){
        iProyectoService.agregarProyecto(proye);
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/editar")
    public void editarProyecto(@RequestBody Proyectos proye){
        iProyectoService.editarProyecto(proye);
    }
    
    @GetMapping("/buscar/{id}")
    @ResponseBody
    public Proyectos buscarProyecto(@PathVariable long id){
        return iProyectoService.buscarProyecto(id);
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/borrar/{id}")
    public void borrarProyecto(@PathVariable long id){
        iProyectoService.borrarProyecto(id);
    }
    
}
