package pack1.Csj28SpringRestDemo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pack1.Csj28SpringRestDemo.entity.Train;
import pack1.Csj28SpringRestDemo.repository.TrainRepos;
import pack1.Csj28SpringRestDemo.service.TrainService;
@Service
public class TrainImpl implements TrainService {

	
	@Autowired
	private TrainRepos repos;
	@Override
	public Train addTrain(Train train) {
	     Train obj= repos.save(train);
		return obj;
	}

	@Override
	public List<Train> getAllTrain() {
		List<Train> listOfTrain=repos.findAll();
		return listOfTrain;
	}

	@Override
	public Train getTrainByNumber(int number) {
		  Train train=repos.getById(number);
		return train;
	}

	@Override
	public int updateTrain(Train train) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void removeTrain(int number) {
		// TODO Auto-generated method stub
		
	}

}
