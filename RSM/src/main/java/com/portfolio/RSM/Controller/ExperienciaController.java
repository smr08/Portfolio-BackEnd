package com.portfolio.RSM.Controller;

import com.portfolio.RSM.Entity.Experiencia;
import com.portfolio.RSM.Interface.IExperienciaService;
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
@RequestMapping("/experiencialab")
@CrossOrigin(origins = "https://portfoliosofiarossi.web.app")
public class ExperienciaController {

    @Autowired
    private IExperienciaService iExperienciaService;
    
    @GetMapping("/traer")
    @ResponseBody
    public List<Experiencia> mostrarExperiencias(){
        return iExperienciaService.mostrarExperiencias();
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/crear")
    public void agregarExperiencia(@RequestBody Experiencia exp){
        iExperienciaService.agregarExperiencia(exp);
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/editar")
    public void editarExperiencia(@RequestBody Experiencia exp){
        iExperienciaService.editarExperiencia(exp);
    }
    
    @GetMapping("/buscar/{id}")
    @ResponseBody
    public Experiencia buscarExperiencia(@PathVariable long id){
        return iExperienciaService.buscarExperiencia(id);
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/borrar/{id}")
    public void borrarExperiencia(@PathVariable long id){
        iExperienciaService.borrarExperiencia(id);
    }

}
