package com.oma.hotelReservation.entities;

import java.util.Date;

import javax.persistence.Entity;

@Entity
public class Visitor extends abstractClass{
	private String firstName;
	private String lastName;
	private int numbersOfGuests;
	private Date checkInDate;
	private Date checkOutDate;
	private boolean roomCheckStatus;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getNumbersOfGuests() {
		return numbersOfGuests;
	}
	public void setNumbersOfGuests(int numbersOfGuests) {
		this.numbersOfGuests = numbersOfGuests;
	}
	public Date getCheckInDate() {
		return checkInDate;
	}
	public void setCheckInDate(Date checkInDate) {
		this.checkInDate = checkInDate;
	}
	public Date getCheckOutDate() {
		return checkOutDate;
	}
	public void setCheckOutDate(Date checkOutDate) {
		this.checkOutDate = checkOutDate;
	}
	public boolean isRoomCheckStatus() {
		return roomCheckStatus;
	}
	public void setRoomCheckStatus(boolean roomCheckStatus) {
		this.roomCheckStatus = roomCheckStatus;
	}
	
}
