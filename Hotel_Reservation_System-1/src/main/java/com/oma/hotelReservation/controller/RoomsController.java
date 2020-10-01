package com.oma.hotelReservation.controller;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.oma.hotelReservation.dto.RequestRoomBooking;
import com.oma.hotelReservation.entities.Rooms;
import com.oma.hotelReservation.repository.RoomsRepository;
import com.oma.hotelReservation.repository.UserRepository;
import com.oma.hotelReservation.services.RoomServices;

@Controller
public class RoomsController {
	
	@Autowired
	RoomsRepository roomsRepo;
	@Autowired
	RoomServices roomService;
	@Autowired
	UserRepository userRepo;
	
	@RequestMapping("/AvailableRooms")
	public String AvailableRooms(@RequestParam("RoomCheckedIn")boolean RoomCheckedIn,@RequestParam("checkInDate")@DateTimeFormat(pattern="MM-dd-yyyy")Date checkInDate,@RequestParam("checkOutDate")@DateTimeFormat(pattern="MM-dd-yyyy")Date checkOutDate,ModelMap map) {
		try {
			List<Rooms> rooms = roomsRepo.serchRooms(checkInDate,checkOutDate,RoomCheckedIn);
			map.addAttribute("rooms", rooms);
		}catch(Exception e) {
			map.addAttribute("msg","Date Formate is Wrong. It should be in formate mm-dd-yyyy ");
		}
		
		return "AvailableRooms";
	}
	
	@RequestMapping("/BookRoom")
	public String BookRoom(@RequestParam("RoomId")Long RoomId,ModelMap map) {
		Optional<Rooms> findById = roomsRepo.findById(RoomId);
		Rooms rooms = findById.get();
		map.addAttribute("rooms", rooms);
		return "ConfirmBooking";
	}
	@RequestMapping("/confirmRoomBooking")
	public String confirmRoomBooking(RequestRoomBooking request,ModelMap map) {
		roomService.confirmRoom(request);
		map.addAttribute("msg", "Your Room Booked Successfully ...");
		return "confirmRoomBooking";
	}
}
