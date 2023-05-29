package com.cyber.Csj28SpringBootDemo2.controller;

import java.time.LocalDate;
import java.util.Collection;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.cyber.Csj28SpringBootDemo2.Flight;
import com.cyber.Csj28SpringBootDemo2.FlightDao;
import com.cyber.Csj28SpringBootDemo2.entity.Book;

@Controller
@SessionAttributes("bookKey1")
public class BookController {
	
	@Autowired
	private FlightDao flightDao;
	
	
	@RequestMapping(path="bookFlight/{fno}")
	public String getBooking(@PathVariable int fno,Model m)
	{
		Flight flight=flightDao.getFlightByNumber(fno);
		
		m.addAttribute("bookKey1", flight);
		return "book1";
		
	}
	@RequestMapping(path="/book2")
    public String startbookingStep(HttpServletRequest request,Model m)
    {
		Book b=new Book();
		b.setBookingDate(LocalDate.now());
		HttpSession session=request.getSession(false);
Flight flight=		(Flight) session.getAttribute("bookKey1");
		b.setFlight(flight);
		b.setPhoneNumber(8147117572L);
		b.setBookingId(b.getPhoneNumber()%10000);
	String uname=(String)	session.getAttribute("userKey");
	b.setUserName(uname);
	b.setTotalPrice(flight.getPrice()*0.12);
	System.out.println(b);
	m.addAttribute("bookInfo", b);
	return "bookingInfo";
    }

}
