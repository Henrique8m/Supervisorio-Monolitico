package com.hrodriguesdev.services;

import java.sql.Date;
import java.sql.SQLException;
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

	public Pyrometry findByDate(Date date) throws SQLException{
		return repository.findByDate(date).orElseThrow(() -> new SQLException() );
	}

}
