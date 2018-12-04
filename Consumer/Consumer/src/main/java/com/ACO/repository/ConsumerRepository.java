package com.ACO.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ACO.domain.BabyNameMessage;

@Repository
public interface ConsumerRepository extends MongoRepository<BabyNameMessage, Long> {

}