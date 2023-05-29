package com.cyber.Csj28SpringBootDemo2.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import com.cyber.Csj28SpringBootDemo2.Flight;
@Entity
@Table(name = "Book_Table")
public class Book {
	
	@Id
	
	private long bookingId;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate bookingDate;
	@OneToOne
	private Flight flight;
	private String userName;
	private long phoneNumber;
	private double totalPrice;
	
	
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	public long getBookingId() {
		return bookingId;
	}
	public void setBookingId(long bookingId) {
		this.bookingId = bookingId;
	}
	public LocalDate getBookingDate() {
		return bookingDate;
	}
	public void setBookingDate(LocalDate bookingDate) {
		this.bookingDate = bookingDate;
	}
	public Flight getFlight() {
		return flight;
	}
	public void setFlight(Flight flight) {
		this.flight = flight;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	@Override
	public String toString() {
		return "Book [bookingId=" + bookingId + ", bookingDate=" + bookingDate + ", flight=" + flight + ", userName="
				+ userName + ", phoneNumber=" + phoneNumber + ", totalPrice=" + totalPrice + "]";
	}
	
	
	}
