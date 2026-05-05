package com.github.MarcusDev01.checkpoint.controller;


import com.github.MarcusDev01.checkpoint.model.Jogos;
import com.github.MarcusDev01.checkpoint.repository.JogoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jogos")
public class JogosController {

    @Autowired
    private JogoRepository repository;

    @PostMapping
    public Jogos salvar(@RequestBody Jogos jogo) {
        return repository.save(jogo);
    }

    @GetMapping
    public List<Jogos> listar() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Jogos buscarPorId(@PathVariable Long id) {
        return repository.findById(id).orElse(null);
    }

    @PutMapping("/{id}")
    public Jogos atualizar(@PathVariable Long id, @RequestBody Jogos jogo) {
        jogo.setId(id);
        return repository.save(jogo);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        repository.deleteById(id);
    }
}