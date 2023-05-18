package com.cyber.Csj28SpringBootDemo2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.CollectionType;
import org.springframework.format.annotation.DateTimeFormat;
@Entity
@Table(name="Flight_Table")
public class Flight {
@Id
	private int flightNumber;
	private String flightName;
	private String flightSource;
	private String flightDestination;
	private double price;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate flihgtDate;

	private String layOvers;
	
	public LocalDate getFlihgtDate() {
		return flihgtDate;
	}
	public void setFlihgtDate(LocalDate flihgtDate) {
		this.flihgtDate = flihgtDate;
	}
	
	public String getLayOvers() {
		return layOvers;
	}
	public void setLayOvers(String layOvers) {
		this.layOvers = layOvers;
	}
	public int getFlightNumber() {
		return flightNumber;
	}
	public void setFlightNumber(int flightNumber) {
		this.flightNumber = flightNumber;
	}
	public String getFlightName() {
		return flightName;
	}
	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}
	public String getFlightSource() {
		return flightSource;
	}
	public void setFlightSource(String flightSource) {
		this.flightSource = flightSource;
	}
	public String getFlightDestination() {
		return flightDestination;
	}
	public void setFlightDestination(String flightDestination) {
		this.flightDestination = flightDestination;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Flight [flightNumber=" + flightNumber + ", flightName=" + flightName + ", flightSource=" + flightSource
				+ ", flightDestination=" + flightDestination + ", price=" + price + ", flihgtDate=" + flihgtDate
				+ ", layOvers=" + layOvers + "]";
	}
	
	
	
}
