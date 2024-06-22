package br.com.sales.comprasservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.sales.comprasservice.entity.Produto;

/**
 * ProdutoRepository
 */
public interface ProdutoRepository extends JpaRepository<Produto, Integer>{

    
}