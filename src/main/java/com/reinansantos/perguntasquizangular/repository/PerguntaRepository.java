package com.reinansantos.perguntasquizangular.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.reinansantos.perguntasquizangular.entity.Pergunta;

public interface PerguntaRepository extends JpaRepository<Pergunta, Long> {
	
}
