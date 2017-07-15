package com.uprr.training.springconfig.trn;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.uprr.training.trn.service.TrainService;
import com.uprr.training.trn.service.TrainServiceImpl;

@Configuration
public class ServiceConfig {
	
	@Bean(name="trainService")
	public TrainService createTrainService() {
		return new TrainServiceImpl();
	}

}
