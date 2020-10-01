package com.oma.hotelReservation.services;

import java.util.List;

import com.oma.hotelReservation.dto.RequestRoomBooking;
import com.oma.hotelReservation.entities.Rooms;

public interface RoomServices {
	
	List<Rooms> FindAllRooms();

	void confirmRoom(RequestRoomBooking request);
}
