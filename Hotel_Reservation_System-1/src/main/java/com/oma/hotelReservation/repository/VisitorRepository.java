package com.oma.hotelReservation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.oma.hotelReservation.entities.Visitor;

public interface VisitorRepository extends JpaRepository<Visitor, Long> {

}
