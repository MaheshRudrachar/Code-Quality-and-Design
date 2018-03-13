package com.mahesh.b.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mahesh.b.ServiceTwoApplication;
import com.mahesh.b.model.AllNameValueTO;
import com.mahesh.b.model.NameValueTO;
import com.mahesh.b.service.NameValueService;

import io.swagger.annotations.ApiOperation;

@RestController
public class NameValueController {

	@Value("${spring.application.name}")
	private String applicationName;

	@Autowired
	private NameValueService nameValueService;

	private Logger logger = Logger.getLogger(ServiceTwoApplication.class);

	@GetMapping(value = "/v1/")
	@ApiOperation(value = "Get name and value", notes = "Get service name and its corresponding values for all the services", response = NameValueTO.class)
	public AllNameValueTO getAllNameValue() {
		logger.info("Inside " + applicationName + " controller's getAllNameValue() method");
		return nameValueService.getAllNameValues(applicationName);
	}

}
