package br.com.sales.comprasservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.sales.comprasservice.entity.Categoria;

/**
 * CategoriaRepository
 */
public interface CategoriaRepository extends JpaRepository<Categoria, Integer>{

    
}