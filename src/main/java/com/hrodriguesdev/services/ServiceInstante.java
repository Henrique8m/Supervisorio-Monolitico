package com.hrodriguesdev.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.jpa.JpaSystemException;
import org.springframework.stereotype.Service;

import com.hrodriguesdev.entity.Instante;
import com.hrodriguesdev.repositories.InstanteRepository;

@Service
public class ServiceInstante {

	@Autowired
	private InstanteRepository repository;
	
	public Instante find() {
		return repository.findAll().get(0);
	}

	public Instante save(Instante instante) throws JpaSystemException{
		return repository.save(instante);
	}

}
