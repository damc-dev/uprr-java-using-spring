package com.uprr.training.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.uprr.training.trn.service.Train;
import com.uprr.training.trn.service.TrainService;

public class TrainingApp {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"training-spring-context.xml");
		TrainService trainService = (TrainService) ctx.getBean("trainService");
				
		Train train = new Train();
		train.setArrivalLocation("Council Bluffs");
		train.setArrived(false);
		train.setSymbol("MLACB");
		train.setTrainDay("12");
		String trainId = trainService.saveTrain(train);
		System.out.printf("train: %s",trainService.getTrain(trainId));
		

	}

}
