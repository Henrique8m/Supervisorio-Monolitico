package com.hrodriguesdev.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hrodriguesdev.entity.Pyrometry;
import com.hrodriguesdev.services.ServicePyrometry;

@RestController
@RequestMapping ("/pyrometry")
public class ControllerPyrometry {
	
//	private static Logger logger = LoggerFactory.getLogger(ControllerPyrometry.class);
			
//	@Value("${test.config}")
//	private String test;	
//	Modelo com restTemplate
//	Tem que usar uma classe de Configuração
//	Value vai pegar do .properties
//	@Value("${s-user.host}")
//	private String userHost;	
//	@Autowired
//	private RestTemplate restTemplate;
//	
//	@Autowired
//	private UserFeignClient userFeignClient;

	@Autowired
	private ServicePyrometry service;
	
	@GetMapping(value = "/pyrometry")
	public ResponseEntity<Pyrometry> findLast() {
//		Modelo com o RestTemplate
//		Map<String, String> uriVariables = new HashMap<>();
//		uriVariables.put("id", "" + 1l);		
//		User user = restTemplate.getForObject(userHost + "/users/{id}", User.class, uriVariables);
		
//		Requisição usando a interface do Feign
//		User user = userFeignClient.findById(1l).getBody();
//		
//		System.out.println(user.getName() + "\n" + user.getEmail());
//		
		Pyrometry pyrometry = service.findLast();
		if(pyrometry == null)
			return ResponseEntity.notFound().build();
		return ResponseEntity.ok().body(pyrometry);
	}
	
//	@GetMapping(value = "/config")
//	public ResponseEntity<Void> getConfigs() {
//		logger.info("Config = " + test);
//		return ResponseEntity.noContent().build();
//	}
}
