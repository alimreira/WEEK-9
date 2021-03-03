package com.feyi.roadtransport.service;

import com.feyi.roadtransport.model.Booking;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public interface BookingService {

    void saveBooking(Booking booking);

    void deleteBookingById(Long Id);

    Optional<Booking> getBookingById(Long Id);

    List<Booking> getAllBookings();

    Booking EditBooking(Long Id, Booking booking);

}
