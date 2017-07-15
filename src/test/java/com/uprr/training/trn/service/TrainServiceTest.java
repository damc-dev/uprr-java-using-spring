package com.uprr.training.trn.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:training-spring-context.xml"})
@TestExecutionListeners(DependencyInjectionTestExecutionListener.class)
public class TrainServiceTest {
	
	@Autowired
	TrainService trainService;
	
	@Test
	public void testSaveTrain() throws Exception {
		
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
