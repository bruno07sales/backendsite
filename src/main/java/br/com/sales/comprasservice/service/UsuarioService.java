package br.com.sales.comprasservice.service;

import org.hibernate.service.spi.ServiceException;
import org.springframework.stereotype.Service;

import br.com.sales.comprasservice.entity.Usuario;
import br.com.sales.comprasservice.repository.UsuarioRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UsuarioService {
    private final UsuarioRepository repository;
    
@Transactional
public Usuario save(Usuario usuarioFormUsuario) {
    if(findUsuarioByEmail(usuarioFormUsuario.getEmail())){
        throw new ServiceException("usuario cadastrado");
    }
    return repository.save(usuarioFormUsuario);
}

private boolean findUsuarioByEmail(String email) {
    var usuario = repository.findByEmail(email);
    return usuario != null && email.equals(usuario.getEmail());
    
    }
}

