package com.oma.hotelReservation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.oma.hotelReservation.entities.User;
import com.oma.hotelReservation.repository.UserRepository;

@Controller
public class UserController {
	
	@Autowired
	UserRepository userRepo;
	
	@RequestMapping("/userLogin")
	public String userLogin() {
		return "UserLoginPage";
	}
	@RequestMapping("/loginUser")
	public String loginUser(@RequestParam("email")String email,@RequestParam("password")String password,ModelMap map) {
		User user = userRepo.findByEmail(email);
		try {
			if(user.getPassword().equals(password)) {
				return "SearchAvailableRooms";
			}else {
				map.addAttribute("msg", "Please Enter Valied User Name And Password");
				return "UserLoginPage";
			}
		}catch(Exception e) {
			map.addAttribute("msg", "Please Enter Valied User Name And Password");
			return "UserLoginPage";
		}
	}
	@RequestMapping("/userRegistration")
	public String userRegistration() {
		return "userRegistration";
	}
	@RequestMapping("/userRegConfirmation")
	public String userRegConfirmation(@ModelAttribute("user")User user) {
		userRepo.save(user);
		return "UserLoginPage";
	}
}
