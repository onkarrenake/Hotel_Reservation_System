package com.oma.hotelReservation.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.oma.hotelReservation.entities.Rooms;

public interface RoomsRepository extends JpaRepository<Rooms, Long> {
	
	//List<Rooms> serchRooms(Date checkInDate, Date checkOutDate);
	@Query("from Rooms where checkInDate=:checkInDate and checkOutDate=:checkOutDate and roomCheckedIn=:roomCheckedIn")
	List<Rooms> serchRooms(@Param("checkInDate") Date checkInDate,@Param("checkOutDate") Date checkOutDate,@Param("roomCheckedIn") boolean roomCheckedIn);

	@Query("from Rooms where roomCheckedIn=:roomCheckedIn")
	List<Rooms> BookedStatus(boolean roomCheckedIn);
}
