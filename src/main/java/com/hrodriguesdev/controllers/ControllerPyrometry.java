package com.hrodriguesdev.controllers;

import java.sql.Date;
import java.sql.SQLException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hrodriguesdev.entity.Pyrometry;
import com.hrodriguesdev.services.ServicePyrometry;

@RestController
@RequestMapping ("/pyrometry")
public class ControllerPyrometry {
	
	public static Logger logger = LoggerFactory.getLogger(ControllerPyrometry.class);
	
	private Date date;

	@Autowired
	private ServicePyrometry service;
	
	@GetMapping
	public ResponseEntity<Pyrometry> findLast() {

		Pyrometry pyrometry = service.findLast();
		if(pyrometry == null)
			return ResponseEntity.notFound().build();
		return ResponseEntity.ok().body(pyrometry);
	}
	
	@SuppressWarnings("deprecation")
	@GetMapping(value = "/")
	public ResponseEntity<Pyrometry> findbyDate(@RequestParam int year,@RequestParam int month, @RequestParam int day, @RequestParam int timeStart, @RequestParam int timeFinish) {
		year -= 1900;
		month -= 1;
		date = new Date(year, month, day);
		logger.info(date.toString());
		logger.info(System.currentTimeMillis() + "");
		System.out.println(System.currentTimeMillis());
		try {
			return ResponseEntity.ok().body(service.findByDate(date) );
			
		}catch(SQLException e) {
			return ResponseEntity.badRequest().build();
			
		}
		
	}
		
//	@PostMapping
//	public ResponseEntity<Pyrometry> saveDateTest(){		
//		date = new Date(System.currentTimeMillis());
//		logger.info(date.toString());
//		Pyrometry pyrometry = new Pyrometry(5.0,1.1,15.00,850,125,350,1150,1250,date);
//		try {
//			pyrometry = service.save(pyrometry);
//			return ResponseEntity.ok().body(pyrometry);
//		}catch (JpaSystemException e) {
//			return ResponseEntity.badRequest().build();	
//		}		
//		
//	}

}
