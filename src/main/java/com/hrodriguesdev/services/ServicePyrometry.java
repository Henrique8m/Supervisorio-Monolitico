package com.hrodriguesdev.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hrodriguesdev.entity.Pyrometry;
import com.hrodriguesdev.repositories.PyrometryRepository;

@Service
public class ServicePyrometry {

	@Autowired
	private PyrometryRepository repository;
	
	public Pyrometry findLast() {
		List<Pyrometry> list = repository.findAll();
		if(list.size() > 0)
			return list.get(list.size()-1);
		return null; 
	}

}
