package com.oma.hotelReservation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.oma.hotelReservation.entities.Admin;

public interface AdminRepository extends JpaRepository<Admin, Long> {

	Admin findByEmail(String email);
	
}
