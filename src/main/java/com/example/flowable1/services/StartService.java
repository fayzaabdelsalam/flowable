package com.example.flowable1.services;

import org.flowable.engine.RuntimeService;
import org.flowable.engine.runtime.ProcessInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class StartService {

	@Autowired
	private RuntimeService runtimeService;

	public String beginCustomerEnrollmentProcess() {
		log.info("Start the process");
		ProcessInstance processInstance = this.runtimeService.startProcessInstanceByKey("signup-process");
		log.info("End the process");
		return processInstance.getId();
	}
}