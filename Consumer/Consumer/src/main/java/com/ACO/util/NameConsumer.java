package com.ACO.util;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import com.ACO.domain.BabyNameMessage;
import com.ACO.service.IConsumerService;

@Component
public class NameConsumer {
	
	@Autowired
	private IConsumerService service;

	@JmsListener(destination = "Names", containerFactory = "myFactory")
	public void receiveMessage(BabyNameMessage name) {
		name.set_id(ObjectId.get());
		service.add(name);
	}
}