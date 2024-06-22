package br.com.sales.comprasservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.sales.comprasservice.entity.Usuario;

/**
 * UsuarioRepository
 */
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
    Usuario findByEmail(String email);
    
}