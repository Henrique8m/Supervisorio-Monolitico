package com.hrodriguesdev.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hrodriguesdev.entity.Balancas;
import com.hrodriguesdev.services.ServiceBalancas;

@RestController
@RequestMapping ("/balancas")
public class ControllerBalancas {

	@Autowired
	private ServiceBalancas service;
	
	@GetMapping
	public ResponseEntity<Balancas> findLast() {
		Balancas balancas = service.findLast();
		if(balancas == null)
			return ResponseEntity.notFound().build();
		return ResponseEntity.ok().body(balancas);
	}
}
