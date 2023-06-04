package com.reinansantos.perguntasquizangular.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.reinansantos.perguntasquizangular.entity.Desafio;
import com.reinansantos.perguntasquizangular.service.DesafioService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/desafio")
@RequiredArgsConstructor
public class DesafioController {

	@Autowired
	private final DesafioService desafioService;
	
	public DesafioController(DesafioService desafioService) {
	this.desafioService = desafioService;
	 }

	@PostMapping
	@CrossOrigin

	public String create(@RequestBody Desafio desafio) {

		return desafioService.create(desafio);
	}

	@GetMapping
	@CrossOrigin

	public List<Desafio> findAll() {

		return desafioService.findAll();
	}

}
