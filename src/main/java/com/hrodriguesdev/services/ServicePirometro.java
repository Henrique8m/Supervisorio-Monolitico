package com.hrodriguesdev.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hrodriguesdev.entity.Pirometro;
import com.hrodriguesdev.repositories.PirometroRepository;

@Service
public class ServicePirometro {

	@Autowired
	private PirometroRepository repository;
	
	public Pirometro findLast() {
		List<Pirometro> list = repository.findAll();
		if(list.size() > 0)
			return list.get(list.size()-1);
		return null; 
	}

}
