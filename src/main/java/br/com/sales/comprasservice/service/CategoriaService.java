package br.com.sales.comprasservice.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.sales.comprasservice.entity.Categoria;
import br.com.sales.comprasservice.repository.CategoriaRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CategoriaService {
    private final CategoriaRepository repository;
    public List <Categoria> all () {
        return repository.findAll();
    }
    @Transactional
    public Categoria save(Categoria categoriaFormCategoria) {
        return repository.save(categoriaFormCategoria);
    }
}
