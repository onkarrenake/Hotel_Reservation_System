package com.oma.hotelReservation.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.oma.hotelReservation.entities.Admin;
import com.oma.hotelReservation.entities.Rooms;
import com.oma.hotelReservation.entities.abstractClass;
import com.oma.hotelReservation.repository.AdminRepository;
import com.oma.hotelReservation.repository.RoomsRepository;
import com.oma.hotelReservation.services.RoomServices;

@Controller
public class AdminController extends abstractClass{
	
	@Autowired
	AdminRepository adminRepo;
	
	@Autowired
	RoomServices roomService;
	
	@Autowired
	RoomsRepository roomsRepo;
	
	@RequestMapping("/AdminLogin")
	public String AdminLogin() {
		return "adminLogin";
	}
	@RequestMapping("/loginAdmin")
	public String loginAdmin(@RequestParam("email")String email,@RequestParam("password")String password,ModelMap map) {
		Admin admin = adminRepo.findByEmail(email);
		try {
			if(admin.getPassword().equals(password)) {
				List<Rooms> findAllRooms = roomService.FindAllRooms();
				map.addAttribute("rooms", findAllRooms);
				return "AdminPanel";
			}else {
				map.addAttribute("msg","Invalied username or password");
				return "adminLogin";
			}
		}catch(Exception e) {
			map.addAttribute("msg","Invalied username or password");
			return "adminLogin";
		}
	}
	
	@RequestMapping("/AddRooms")
	public String AddRooms(ModelMap map) {
		List<Rooms> findAllRooms = roomService.FindAllRooms();
		map.addAttribute("rooms", findAllRooms);
		return "AddAvailableRooms";
	}
	
	@RequestMapping("/availableR")
	public String AvailableR(@RequestParam("roomNumber")int roomNumber,
	@RequestParam("roomType")String roomType,
	@RequestParam("numbersOfGuests")int numbersOfGuests,
	@RequestParam("checkInDate")@DateTimeFormat(pattern="MM-dd-yyyy") Date checkInDate,
	@RequestParam("checkOutDate")@DateTimeFormat(pattern="MM-dd-yyyy") Date checkOutDate,
	@RequestParam("roomCheckedIn")boolean roomCheckedIn,ModelMap map){
		
		Rooms room = new Rooms();
		room.setRoomNumber(roomNumber);
		room.setRoomType(roomType);
		room.setNumbersOfGuests(numbersOfGuests);
		room.setCheckInDate(checkInDate);
		room.setCheckOutDate(checkOutDate);
		room.setRoomCheckedIn(roomCheckedIn);
		try {
			roomsRepo.save(room);
		}catch(Exception e) {
			map.addAttribute("msg","Alredy Room Are Present");
		}
		
		List<Rooms> findAllRooms = roomService.FindAllRooms();
		map.addAttribute("rooms", findAllRooms);
		return "AddAvailableRooms";
	}
	
	@RequestMapping("/bookedStatus")
	public String BookedStatus(ModelMap map) {
		boolean roomCheckedIn = true;
		List<Rooms> bookedStatus = roomsRepo.BookedStatus(roomCheckedIn);
		map.addAttribute("bookedStatus", bookedStatus);
		return "BookedStatus";
	}
}
