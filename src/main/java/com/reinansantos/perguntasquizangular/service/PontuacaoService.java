package com.reinansantos.perguntasquizangular.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reinansantos.perguntasquizangular.entity.Pontuacao;
import com.reinansantos.perguntasquizangular.repository.PontuacaoRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PontuacaoService {
	
	@Autowired
	private final PontuacaoRepository pontuacaoRepository;

	public PontuacaoService(PontuacaoRepository PontuacaoRepository) {

		this.pontuacaoRepository = PontuacaoRepository;
	}

	public String create(Pontuacao pontuacao) {

		Pontuacao savedPontuacao = pontuacaoRepository.save(pontuacao);

		//verificar como pegar id da pergunta
		return "Pontuação salva: " + savedPontuacao;
	}

	public List<Pontuacao> findAll() {

		return pontuacaoRepository.findAll();
	}


}
