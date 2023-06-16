package com.mymovieplan.api.model;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Booking")
public class Bookings {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="bookingId")
	private int bookingId;
	@Column(name="userId")
	private int userId;
	@Column(name="bookingDetails")
	private List<String> bookingDetails;
	@Column(name="bookingAmount")
	private double bookingAmount;
	@Column(name="bookingStamp")
	private LocalDateTime bookingStamp;
	
	public Bookings() {
		
	}
	public int getBookingId() {
		return bookingId;
	}
	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public List<String> getBookingDetails() {
		return bookingDetails;
	}
	public void setBookingDetails(List<String> bookingDetails) {
		this.bookingDetails = bookingDetails;
	}
	public double getBookingAmount() {
		return bookingAmount;
	}
	public void setBookingAmount(double bookingAmount) {
		this.bookingAmount = bookingAmount;
	}
	public LocalDateTime getBookingStamp() {
		return bookingStamp;
	}
	public void setBookingStamp(LocalDateTime bookingStamp) {
		this.bookingStamp = bookingStamp;
	}
	
	
	
}
