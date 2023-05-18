package com.cyber.Csj28SpringBootDemo2;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface FlightRepos extends JpaRepository<Flight, Integer> {
    @Transactional
	@Modifying
	@Query("update Flight f set f.flightSource=:src ,"
			+ "f.flightDestination=:dest,f.price=:prc where "
			+ "f.flightNumber=:num")
	public int updateFlight(@Param("src")String source,
			@Param("dest") String dest, 
			@Param("prc")double price, 
			@Param("num")int fligthNumber);
	
	
	
	
}
