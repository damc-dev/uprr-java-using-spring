package com.uprr.training.trn.service;

public interface TrainService {

	String saveTrain(Train train);

	Train getTrain(String trainId);

}