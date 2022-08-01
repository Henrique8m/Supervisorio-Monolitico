package com.hrodriguesdev.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hrodriguesdev.entity.Carvao;
import com.hrodriguesdev.repositories.CarvaoRepository;

@Service
public class ServiceCarvao {

	@Autowired
	private CarvaoRepository repository;
	
	public Carvao findLast() {
		List<Carvao> list = repository.findAll();
		if(list.size() > 0)
			return list.get(list.size()-1);
		return null; 
	}

}
