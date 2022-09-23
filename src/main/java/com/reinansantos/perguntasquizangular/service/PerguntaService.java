package com.reinansantos.perguntasquizangular.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.reinansantos.perguntasquizangular.entity.Pergunta;
import com.reinansantos.perguntasquizangular.repository.PerguntaRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PerguntaService {
	
	private final PerguntaRepository perguntaRepository;

	public String create(Pergunta pergunta) {
		
		Pergunta savedPergunta = perguntaRepository.save(pergunta);
		
		return "Pergunta salva com o Id: " + savedPergunta.getId();
	}

	public List<Pergunta> findAll() {
		
		return perguntaRepository.findAll();
	}

		

}
