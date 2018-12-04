package com.ACO.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ACO.domain.BabyName;

@Repository
public interface IBabyNameRepo extends CrudRepository<BabyName, Long> {

}
