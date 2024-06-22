package br.com.sales.comprasservice.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.sales.comprasservice.entity.Categoria;
import br.com.sales.comprasservice.service.CategoriaService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/categorias")
@RequiredArgsConstructor
public class CategoriaController {
    private final CategoriaService service;
    @GetMapping
    public ResponseEntity <List <Categoria>> all () {
        return ResponseEntity.ok(service.all());
    }

      @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Categoria> save(@RequestBody Categoria categoriaFormCategoria) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.save(categoriaFormCategoria));
    }

}
