package com.oma.hotelReservation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.oma.hotelReservation.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	User findByEmail(String email);
}
