package com.mahesh.a.service.impl;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.mahesh.a.component.queue.ServiceOneRabbitMQBean;
import com.mahesh.a.model.NameValueTO;
import com.mahesh.a.service.NameValueService;

@Service("serviceOneRabbitMessageConsumer")
public class ServiceOneRabbitMessageConsumer {

	private Logger logger = LoggerFactory.getLogger(ServiceOneRabbitMessageConsumer.class);

	@Autowired
	private NameValueService nameValueService;

	@RabbitListener(queues = ServiceOneRabbitMQBean.queueName)
	public void process(String data) {
		
		logger.info("Received data (" + data + ") from RabbitMQ");
		try {
			NameValueTO nameValueTO = new ObjectMapper().readValue(data, NameValueTO.class);
			logger.info("Processd data as (" + nameValueTO + ")");
			nameValueService.updateNameValue(nameValueTO, true);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
