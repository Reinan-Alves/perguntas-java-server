package com.reinansantos.perguntasquizangular.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.reinansantos.perguntasquizangular.entity.Pontuacao;
import com.reinansantos.perguntasquizangular.service.PontuacaoService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/pontuacao")
@RequiredArgsConstructor
public class PontuacaoController {

	@Autowired
	private final PontuacaoService pontuacaoService;
	
	public PontuacaoController(PontuacaoService pontuacaoService) {
	this.pontuacaoService = pontuacaoService;
	 }
	
	@PostMapping
	@CrossOrigin

	public String create(@RequestBody Pontuacao pontuacao) {

		return pontuacaoService.create(pontuacao);
	}

	@GetMapping
	@CrossOrigin

	public List<Pontuacao> findAll() {

		return pontuacaoService.findAll();
	}
	
	
}
