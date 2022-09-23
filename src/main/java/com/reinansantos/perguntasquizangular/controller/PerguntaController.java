package com.reinansantos.perguntasquizangular.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.reinansantos.perguntasquizangular.entity.Pergunta;
import com.reinansantos.perguntasquizangular.service.PerguntaService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/perguntas")
@RequiredArgsConstructor
public class PerguntaController {
	
	private final PerguntaService perguntaService;
	
	@PostMapping
	public String create(@RequestBody Pergunta pergunta) {
		
		return perguntaService.create(pergunta);
	}
	
	
	@GetMapping
	public List<Pergunta> findAll(){
		
		return perguntaService.findAll();
	}

}
