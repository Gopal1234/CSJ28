package pack1.Csj28SpringRestDemo.service;

import java.util.List;

import pack1.Csj28SpringRestDemo.entity.Train;

public interface TrainService {

	public Train addTrain(Train tarin);
	public List<Train> getAllTrain();
	
	public Train getTrainByNumber(int number);
	public int updateTrain(Train train);
	public void removeTrain(int number);
	}
