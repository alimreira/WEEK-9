package com.feyi.roadtransport.repositories;

import com.feyi.roadtransport.model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository <Booking,Long>{
}
