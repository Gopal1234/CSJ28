package cyber.pack1;

import java.util.Map;

public class Train {
	
	
	private Map<Integer,Passenger> trainInfo;

	public Train(Map<Integer, Passenger> trainInfo) {
		super();
		this.trainInfo = trainInfo;
	}

	public Map<Integer, Passenger> getTrainInfo() {
		return trainInfo;
	}
	

}
