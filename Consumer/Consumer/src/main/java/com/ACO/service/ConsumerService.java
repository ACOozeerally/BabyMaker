package com.ACO.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ACO.domain.BabyNameMessage;
import com.ACO.repository.ConsumerRepository;

@Service
public class ConsumerService implements IConsumerService {

	@Autowired
	private ConsumerRepository consumerRepo;

	public Iterable<BabyNameMessage> getAll() {
		return consumerRepo.findAll();
	}

	public BabyNameMessage add(BabyNameMessage name) {
		return consumerRepo.save(name);
	}

	public void delete(Long id) {
		consumerRepo.deleteById(id);
	}

	public Optional<BabyNameMessage> get(Long id) {
		return consumerRepo.findById(id);
	}

	public void setRepo(ConsumerRepository consumerRepo) {
		this.consumerRepo = consumerRepo;
	}
}