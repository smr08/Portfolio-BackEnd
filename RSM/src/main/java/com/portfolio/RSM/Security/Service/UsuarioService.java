
package com.portfolio.RSM.Security.Service;

import com.portfolio.RSM.Security.Entity.Usuario;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.portfolio.RSM.Security.Repository.UsuarioRepository;

@Service
@Transactional
public class UsuarioService {
    @Autowired
    UsuarioRepository usuarioRepository;
    
    public Optional<Usuario> getByNombreUsuario(String nombreUsuario){
       return usuarioRepository.findByNombreUsuario(nombreUsuario);
    }
    
    public boolean existsByNombreUsuario(String nombreUsuario) {
        return usuarioRepository.existsByNombreUsuario(nombreUsuario);
    }
    
    public boolean existsByEmail(String email) {
        return usuarioRepository.existsByEmail(email);
    }
    
    public void save(Usuario usuario){
        usuarioRepository.save(usuario);
    }
}
