package com.ACO.domain;

import org.springframework.stereotype.Component;

@Component
public class BabyNameMessage {
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
