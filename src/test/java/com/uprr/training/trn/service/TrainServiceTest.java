package com.uprr.training.trn.service;

import static org.junit.Assert.*;

import org.junit.Test;

public class TrainServiceTest {
	
	@Test
	public void testSaveTrain() throws Exception {
		TrainService trainService = new TrainService();
		
		Train train = new Train();
		train.setArrivalLocation("Council Bluffs");
		train.setArrived(false);
		train.setSymbol("MLACB");
		train.setTrainDay("12");
		
		String trainId = trainService.saveTrain(train);
		assertNotNull("Train ID should not be null", trainId);
		
		Train train2 = trainService.getTrain(trainId);
		assertEquals(train, train2);
	}
}
