package com.ACO.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ACO.Util.NameGen;

@Service
public class NameGenService implements INameGenService {

	@Autowired
	private NameGen ng;

	@Override
	public String createName(Long length, String preName) {

		return ng.nameGenerator(length, preName);

	}

}