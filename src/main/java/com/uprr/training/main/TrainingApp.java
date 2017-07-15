package com.uprr.training.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.uprr.training.springconfig.trn.ServiceConfig;
import com.uprr.training.trn.service.Train;
import com.uprr.training.trn.service.TrainService;

public class TrainingApp {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ServiceConfig.class);

		TrainService trainService = ctx.getBean(TrainService.class);
				
		Train train = new Train();
		train.setArrivalLocation("Council Bluffs");
		train.setArrived(false);
		train.setSymbol("MLACB");
		train.setTrainDay("12");
		String trainId = trainService.saveTrain(train);
		System.out.printf("train: %s",trainService.getTrain(trainId));
		
		ctx.close();

	}

}
