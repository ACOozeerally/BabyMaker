package com.ACO.service;

import java.util.Optional;

import com.ACO.domain.BabyNameMessage;
import com.ACO.repository.ConsumerRepository;

public interface IConsumerService {

	Iterable<BabyNameMessage> getAll();

	BabyNameMessage add(BabyNameMessage name);

	void delete(Long id);

	Optional<BabyNameMessage> get(Long id);

	void setRepo(ConsumerRepository consumerRepo);

}