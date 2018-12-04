package com.ACO.Util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

import com.ACO.domain.BabyName;
import com.ACO.domain.BabyNameMessage;

@Component
public class BabyNameProducer {

	@Autowired
	private JmsTemplate jmsTemplate;

	@Autowired
	private BabyNameMessage nameMessage;

	public String produce(BabyName name) {
		nameMessage.setName(name.getName());
		jmsTemplate.convertAndSend("Names", nameMessage);
		return "Successfully created a baby";
	}
}