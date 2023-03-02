package com.example.flowable1.services;

import org.flowable.engine.delegate.DelegateExecution;
import org.flowable.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Service;

import lombok.extern.log4j.Log4j2;

@Log4j2
@Service("loadService")
public class LoadService implements JavaDelegate {

    @Override
    public void execute(DelegateExecution execution) {
		log.info("confirm email task");
    }

}