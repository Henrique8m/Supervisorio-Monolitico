package com.hrodriguesdev.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hrodriguesdev.entity.Grafico;
import com.hrodriguesdev.services.ServiceGrafico;

@RestController
@RequestMapping ("/grafico")
public class ControllerGrafico {

	@Autowired
	private ServiceGrafico service;
	
	@GetMapping
	public ResponseEntity<Grafico> findLast() {
		Grafico grafico = service.findLast();
		if(grafico == null)
			return ResponseEntity.notFound().build();
		return ResponseEntity.ok().body(grafico);
	}
}
