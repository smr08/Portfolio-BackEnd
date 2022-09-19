
package com.portfolio.RSM.Controller;

import com.portfolio.RSM.Entity.Persona;
import com.portfolio.RSM.Interface.IPersonaService;
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
import org.springframework.web.bind.annotation.RestController;

@RestController 
@RequestMapping("/personas")
@CrossOrigin(origins ="https://portfoliosofiarossi.web.app")
public class PersonaController {
    @Autowired IPersonaService ipersonaService;
    
    
    @GetMapping("/traer")
    public List<Persona> getPersona() {
        return ipersonaService.getPersona();
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/crear")
    public void createPersona(@RequestBody Persona persona){
        ipersonaService.savePersona(persona);
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/borrar/{id}")
    public void deletePersona(@PathVariable Long id){
        ipersonaService.deletePersona(id);
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping ("/editar")
    public void editPerson(@RequestBody Persona persona){
        ipersonaService.editPersona(persona);
    }

    
    @GetMapping("/traer/perfil")
    public Persona findPersona(){
       return ipersonaService.findPerona((long)1); 
    }
}
