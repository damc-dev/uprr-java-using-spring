package com.uprr.training.trn.service;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class TrainServiceImpl implements TrainService {

	private final Map<String, Train> trains = new HashMap<String, Train>();
	
	/* (non-Javadoc)
	 * @see com.uprr.training.trn.service.TrainService#saveTrain(com.uprr.training.trn.service.Train)
	 */
	public String saveTrain(Train train) {
		train.setId(UUID.randomUUID().toString());
		trains.put(train.getId(), train);
		return train.getId();
	}

	/* (non-Javadoc)
	 * @see com.uprr.training.trn.service.TrainService#getTrain(java.lang.String)
	 */
	public Train getTrain(String trainId) {
		return trains.get(trainId);
	}

}
