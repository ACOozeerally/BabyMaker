package com.ACO.domain;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

public class BabyNameMessage {

	@Id
	public ObjectId id;
	private String name;

	public BabyNameMessage() {

	}

	public ObjectId get_id() {
		return id;
	}

	public void set_id(ObjectId id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}