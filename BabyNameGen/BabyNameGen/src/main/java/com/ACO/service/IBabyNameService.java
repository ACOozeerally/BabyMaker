package com.ACO.service;

import java.util.Optional;

import com.ACO.domain.BabyName;
import com.ACO.repository.IBabyNameRepo;

public interface IBabyNameService {

	public BabyName createBaby(BabyName name);

	public String deleteBaby(Long id);

	public Optional<BabyName> findBaby(Long id);

	public Iterable<BabyName> getAllBabies();

	public String updateBaby(Long id, BabyName name);

	public void setRepo(IBabyNameRepo namingRepo);

}
