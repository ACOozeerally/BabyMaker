package com.ACO.Util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class BabyNamingRestTemplate {

	@Autowired
	private RestTemplate restTemplate;

	public String getRandomName(Long length, String preName) {
		return restTemplate.getForObject("http://localhost:8089/generateName/" + length + "/" + preName, String.class);
	}
}
