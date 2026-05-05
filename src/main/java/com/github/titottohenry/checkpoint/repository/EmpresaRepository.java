package com.github.MarcusDev01.checkpoint.repository;


import com.github.MarcusDev01.checkpoint.model.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpresaRepository extends JpaRepository<Empresa, Long> {
}