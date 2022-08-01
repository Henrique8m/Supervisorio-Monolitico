package com.hrodriguesdev.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hrodriguesdev.entity.Carvao;
import com.hrodriguesdev.services.ServiceCarvao;

@RestController
@RequestMapping ("/carvao")
public class ControllerCarvao {

	@Autowired
	private ServiceCarvao service;
	
	@GetMapping
	public ResponseEntity<Carvao> findLast() {
		Carvao carvao = service.findLast();
		if(carvao == null)
			return ResponseEntity.notFound().build();
		return ResponseEntity.ok().body(carvao);
	}
}
