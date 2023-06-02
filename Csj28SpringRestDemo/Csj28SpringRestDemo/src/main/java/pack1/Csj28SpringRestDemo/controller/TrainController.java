package pack1.Csj28SpringRestDemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import pack1.Csj28SpringRestDemo.dao.TrainImpl;
import pack1.Csj28SpringRestDemo.entity.Train;

@RestController
public class TrainController {

	@Autowired
	private TrainImpl dao;
	
	//uri:localhost:8148/fetchTrain
	@PostMapping(path="/createTrain")
	public Train createTrain(@RequestBody  Train train)
	{
	Train newTrain=	   dao.addTrain(train);
	return newTrain;
	}
	
	
	
	@GetMapping(path="/fetchTrain")
	public List<Train> getMyTrains()
	{
		
		return dao.getAllTrain();
	}
	
	@GetMapping(path="/fetch/{tno}")
	public Train getMyTrainByNumber(@PathVariable int tno)
	{
		
		return dao.getTrainByNumber(tno);
	}
	
	
}
