package com.reinansantos.perguntasquizangular.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.reinansantos.perguntasquizangular.entity.Pontuacao;

public interface PontuacaoRepository extends JpaRepository<Pontuacao, Long> {
	
}

