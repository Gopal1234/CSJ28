package com.cyber.Csj28SpringBootDemo2;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FlightDao implements FlightService {

	@Autowired
 FlightRepos repos;
	@Override
	public Flight saveFlight(Flight flight) {
	Flight flightObj=	repos.save(flight);
		return flightObj;
	}

	@Override
	public List<Flight> getAllFlight() {
		List<Flight> listOfFlight=repos.findAll();
		return listOfFlight;
	}
    public Flight getFlightByNumber(int number)
    {
    	Flight flight=repos.getById(number);
    	return flight;
    }
    public int updateFlight(String source, String destination, double price, int fNum)
    {
    	System.out.println("Hi");
    	int k=repos.updateFlight(source, destination, price, fNum);
    	return k;
    }
}
