package br.com.sales.comprasservice.service;

import org.springframework.stereotype.Service;

import br.com.sales.comprasservice.repository.ProdutoRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProdutoService {
    private final ProdutoRepository repository;
    
}
