package com.github.MarcusDev01.checkpoint.controller;



import com.github.MarcusDev01.checkpoint.model.Empresa;
import com.github.MarcusDev01.checkpoint.repository.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/empresas")
public class EmpresaController {

    @Autowired
    private EmpresaRepository repository;

    @PostMapping
    public Empresa salvar(@RequestBody Empresa empresa) {
        return repository.save(empresa);
    }

    @GetMapping
    public List<Empresa> listar() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Empresa buscarPorId(@PathVariable Long id) {
        return repository.findById(id).orElse(null);
    }

    @PutMapping("/{id}")
    public Empresa atualizar(@PathVariable Long id, @RequestBody Empresa empresa) {
        empresa.setId(id);
        return repository.save(empresa);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        repository.deleteById(id);
    }
}