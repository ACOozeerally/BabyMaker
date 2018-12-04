package com.ACO.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ACO.service.INameGenService;

@RestController
public class NameGenEndpoint {

	@Autowired
	INameGenService service;

	@RequestMapping("generateName/{nameLength}/{preName}")
	public String createName(@PathVariable Long nameLength, String preName) {
		return service.createName(nameLength, preName);
	}

}
