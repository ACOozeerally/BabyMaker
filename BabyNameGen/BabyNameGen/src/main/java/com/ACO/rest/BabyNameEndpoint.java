package com.ACO.rest;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ACO.domain.BabyName;
import com.ACO.service.IBabyNameService;

@RequestMapping("/Names")
@RestController
@CrossOrigin
public class BabyNameEndpoint {

	@Autowired
	private IBabyNameService service;

	@GetMapping("/getall")
	public Iterable<BabyName> getAllBabies() {
		return service.getAllBabies();
	}

	@GetMapping("/find/{id}")
	public Optional<BabyName> findBaby(@PathVariable Long id) {
		return service.findBaby(id);
	}

	@PostMapping("/create")
	public BabyName createBaby(@RequestBody BabyName name) {
		return service.createBaby(name);
	}

	@DeleteMapping("/delete/{id}")
	public String deleteBaby(@PathVariable Long id) {
		return service.deleteBaby(id);
	}

	@PutMapping("/update/{id}")
	public String updateBaby(@PathVariable Long id, @RequestBody BabyName name) {
		return service.updateBaby(id, name);
	}

}
