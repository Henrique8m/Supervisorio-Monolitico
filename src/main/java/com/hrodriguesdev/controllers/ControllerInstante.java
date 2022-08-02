package com.hrodriguesdev.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.orm.jpa.JpaSystemException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hrodriguesdev.entity.Instante;
import com.hrodriguesdev.services.ServiceInstante;

@RestController
@RequestMapping ("/instante")
public class ControllerInstante {

	@Autowired
	private ServiceInstante service;
	
	@GetMapping
	public ResponseEntity<Instante> findLast() {
		Instante instante = service.find();
		if(instante == null)
			return ResponseEntity.notFound().build();
		return ResponseEntity.ok().body(instante);
	}
	
	@PostMapping
	public ResponseEntity<Instante> saveDateTest(){		
		Instante instante = new Instante(6.5, 2.3, 16.23, 620, 123, 123);
		try {
			instante = service.save(instante);
			return ResponseEntity.ok().body(instante);
		}catch (JpaSystemException e) {
			return ResponseEntity.badRequest().build();	
		}		
		
	}
	
}
