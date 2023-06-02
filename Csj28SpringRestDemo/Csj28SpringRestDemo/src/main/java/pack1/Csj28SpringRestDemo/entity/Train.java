package pack1.Csj28SpringRestDemo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "Train_Table")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Train {
	@Id
	private int trainNumber;
	private String trainName;
	private String trainSource;
	private String trainDesination;
	private  double trainPrice;
	public int getTrainNumber() {
		return trainNumber;
	}
	public void setTrainNumber(int trainNumber) {
		this.trainNumber = trainNumber;
	}
	public String getTrainName() {
		return trainName;
	}
	public void setTrainName(String trainName) {
		this.trainName = trainName;
	}
	public String getTrainSource() {
		return trainSource;
	}
	public void setTrainSource(String trainSource) {
		this.trainSource = trainSource;
	}
	public String getTrainDesination() {
		return trainDesination;
	}
	public void setTrainDesination(String trainDesination) {
		this.trainDesination = trainDesination;
	}
	public double getTrainPrice() {
		return trainPrice;
	}
	public void setTrainPrice(double trainPrice) {
		this.trainPrice = trainPrice;
	}
	
	

}
