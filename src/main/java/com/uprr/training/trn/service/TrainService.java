package com.uprr.training.trn.service;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class TrainService {

	private final Map<String, Train> trains = new HashMap<String, Train>();
	
	public String saveTrain(Train train) {
		train.setId(UUID.randomUUID().toString());
		trains.put(train.getId(), train);
		return train.getId();
	}

	public Train getTrain(String trainId) {
		return trains.get(trainId);
	}

}
