package com.github.MarcusDev01.checkpoint.repository;

import com.github.MarcusDev01.checkpoint.model.Jogos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JogoRepository extends JpaRepository<Jogos, Long> {
}