package com.ACO.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

import com.ACO.Util.BabyNameProducer;
import com.ACO.Util.BabyNamingRestTemplate;
import com.ACO.domain.BabyName;
import com.ACO.repository.IBabyNameRepo;

@Service
public class BabyNameService implements IBabyNameService {

	@Autowired
	private IBabyNameRepo repo;

	@Autowired
	private BabyNamingRestTemplate apiCaller;

	@Autowired
	private BabyNameProducer producer;

	public BabyName createBaby(BabyName name) {
		name.setName(apiCaller.getRandomName(name.getLength(), name.getPreName()));
		producer.produce(name);
		return repo.save(name);
	}

	public String deleteBaby(Long id) {
		repo.deleteById(id);
		return "Name deleted";
	}

	public Iterable<BabyName> getAllBabies() {
		return repo.findAll();
	}

	@Override
	public Optional<BabyName> findBaby(Long id) {
		return repo.findById(id);
	}

	@Override
	public String updateBaby(Long id, BabyName name) {
		if (repo.findById(id) != null) {
			BabyName oldBaby = repo.findById(id).get();
			oldBaby.setName(name.getName());
			return "Baby updated";
		}
		return "Baby not updated";
	}

	public void setRepo(IBabyNameRepo repo) {
		this.repo = repo;
	}

}
