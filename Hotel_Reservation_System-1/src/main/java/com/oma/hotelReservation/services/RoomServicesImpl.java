package com.oma.hotelReservation.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oma.hotelReservation.dto.RequestRoomBooking;
import com.oma.hotelReservation.entities.Rooms;
import com.oma.hotelReservation.repository.RoomsRepository;
import com.oma.hotelReservation.repository.VisitorRepository;
@Service
public class RoomServicesImpl implements RoomServices {
	
	@Autowired
	RoomsRepository roomRepo;
	@Autowired
	VisitorRepository visitorRepo;
		
	@Override
	public List<Rooms> FindAllRooms() {
		List<Rooms> findAll = roomRepo.findAll();
		return findAll;
	}

	@Override
	public void confirmRoom(RequestRoomBooking request) {
		Long roomId = request.getRoomId();
		Optional<Rooms> findById = roomRepo.findById(roomId);
		Rooms rooms = findById.get();
		rooms.setRoomCheckedIn(true);
		rooms.setFirstName(request.getUserFirstName());
		rooms.setLastName(request.getUserLastName());
		rooms.setEmail(request.getUserEmail());
		rooms.setMobileNumber(request.getUserMobileNumber());
		roomRepo.save(rooms);
	}
}
