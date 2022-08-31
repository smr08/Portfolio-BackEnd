
package com.portfolio.RSM.Controller;

import com.portfolio.RSM.Entity.Educacion;
import com.portfolio.RSM.Interface.IEducacionService;
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
@RequestMapping("/educacion")
@CrossOrigin(origins="http://localhost:4200")
public class EducacionController {
    @Autowired
    private IEducacionService iEducacionService;
    
    @GetMapping("/traer")
    @ResponseBody
    public List<Educacion> mostrarEducacion(){
        return iEducacionService.mostrarEducacion();
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/crear")
    public void agregarEducacion(@RequestBody Educacion edu){
        iEducacionService.agregarEducacion(edu);
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/editar")
    public void editarEducacion(@RequestBody Educacion edu){
        iEducacionService.editarEducacion(edu);
    }
    
    @GetMapping("/buscar/{id}")
    @ResponseBody
    public Educacion buscarEducacion(@PathVariable long id){
        return iEducacionService.buscarEducacion(id);
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/borrar/{id}")
    public void borrarEducacion(@PathVariable long id){
        iEducacionService.borrarEducacion(id);
    }
    
}
