package com.hrodriguesdev.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hrodriguesdev.entity.Grafico;
import com.hrodriguesdev.repositories.GraficoRepository;

@Service
public class ServiceGrafico {

	@Autowired
	private GraficoRepository repository;
	
	public Grafico findLast() {
		List<Grafico> list = repository.findAll();
		if(list.size() > 0)
			return list.get(list.size()-1);
		return null; 
	}

}
