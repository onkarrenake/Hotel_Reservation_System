package com.oma.hotelReservation.entities;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Entity;

@Entity
public class Rooms extends abstractClass{

	private String firstName;
	private String lastName;
	private String mobileNumber;
	private String email;
	private int roomNumber;
	private String roomType;
	private int numbersOfGuests;
	private Date checkInDate;
	private Date checkOutDate;
	private Timestamp estimatedTime;
	private boolean RoomCheckedIn;
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
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}
	public String getRoomType() {
		return roomType;
	}
	public void setRoomType(String roomType) {
		this.roomType = roomType;
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
	public Timestamp getEstimatedTime() {
		return estimatedTime;
	}
	public void setEstimatedTime(Timestamp estimatedTime) {
		this.estimatedTime = estimatedTime;
	}
	public boolean isRoomCheckedIn() {
		return RoomCheckedIn;
	}
	public void setRoomCheckedIn(boolean roomCheckedIn) {
		RoomCheckedIn = roomCheckedIn;
	}

}
