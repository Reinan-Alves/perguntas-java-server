package com.reinansantos.perguntasquizangular.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reinansantos.perguntasquizangular.entity.Desafio;
import com.reinansantos.perguntasquizangular.repository.DesafioRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class DesafioService {

	@Autowired
	private final DesafioRepository desafioRepository;

	public DesafioService(DesafioRepository DesafioRepository) {

		this.desafioRepository = DesafioRepository;
	}

	public String create(Desafio desafio) {

		Desafio savedDesafio = desafioRepository.save(desafio);

		//verificar como pegar id da pergunta
		return "desafio salvo com o Id: " + savedDesafio;
	}

	public List<Desafio> findAll() {

		return desafioRepository.findAll();
	}

}
