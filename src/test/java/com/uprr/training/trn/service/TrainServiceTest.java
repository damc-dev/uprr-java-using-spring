package com.uprr.training.trn.service;

import static org.junit.Assert.*;

import org.junit.Test;

public class TrainServiceTest {
	
	@Test
	public void testSaveTrain() throws Exception {
		TrainService trainService = new TrainService();
		
		Train train = new Train();
		
		String trainId = trainService.saveTrain(train);
		assertNotNull("Train ID should not be null", trainId);
		
	}
}
