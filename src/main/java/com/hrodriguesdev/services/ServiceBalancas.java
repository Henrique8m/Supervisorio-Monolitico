package com.hrodriguesdev.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hrodriguesdev.entity.Balancas;
import com.hrodriguesdev.repositories.BalancasRepository;

@Service
public class ServiceBalancas {

	@Autowired
	private BalancasRepository repository;
	
	public Balancas findLast() {
		List<Balancas> list = repository.findAll();
		if(list.size() > 0)
			return list.get(list.size()-1);
		return null; 
	}

}
