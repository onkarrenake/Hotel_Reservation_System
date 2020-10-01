package com.oma.hotelReservation.dto;


import com.oma.hotelReservation.entities.abstractClass;

public class RequestRoomBooking extends abstractClass {
	private Long RoomId;
	
	private String userFirstName;
	private String userLastName;
	private String userEmail;
	private String userMobileNumber;
	
	private boolean roomCheckedIn;
	private int numbersOfGuests;
	public Long getRoomId() {
		return RoomId;
	}
	public void setRoomId(Long roomId) {
		RoomId = roomId;
	}
	public String getUserFirstName() {
		return userFirstName;
	}
	public void setUserFirstName(String userFirstName) {
		this.userFirstName = userFirstName;
	}
	public String getUserLastName() {
		return userLastName;
	}
	public void setUserLastName(String userLastName) {
		this.userLastName = userLastName;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserMobileNumber() {
		return userMobileNumber;
	}
	public void setUserMobileNumber(String userMobileNumber) {
		this.userMobileNumber = userMobileNumber;
	}
	public boolean isRoomCheckedIn() {
		return roomCheckedIn;
	}
	public void setRoomCheckedIn(boolean roomCheckedIn) {
		this.roomCheckedIn = roomCheckedIn;
	}
	public int getNumbersOfGuests() {
		return numbersOfGuests;
	}
	public void setNumbersOfGuests(int numbersOfGuests) {
		this.numbersOfGuests = numbersOfGuests;
	}
	
}
