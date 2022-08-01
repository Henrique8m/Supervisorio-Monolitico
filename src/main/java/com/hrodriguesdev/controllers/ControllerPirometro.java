package com.hrodriguesdev.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hrodriguesdev.entity.Pirometro;
import com.hrodriguesdev.services.ServicePirometro;

@RestController
@RequestMapping ("/pirometro")
public class ControllerPirometro {

	@Autowired
	private ServicePirometro service;
	
	@GetMapping
	public ResponseEntity<Pirometro> findLast() {
		Pirometro pirometro = service.findLast();
		if(pirometro == null)
			return ResponseEntity.notFound().build();
		return ResponseEntity.ok().body(pirometro);
	}
}
