package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.BookingRepository;
import com.model.Booking;

@Service
public class BookingServiceImpl implements BookingService {

    @Autowired
    private BookingRepository bookingRepo;

    @Override
    public Booking reserve(Booking booking) {
        booking.setPaymentStatus("Pending");
        return bookingRepo.save(booking);
    }

    @Override
    public Booking confirm(Long bookingId) {
        Booking booking = bookingRepo.findById(bookingId).orElse(null);
        if (booking != null) {
            booking.setPaymentStatus("Confirmed");
            bookingRepo.save(booking);
        }
        return booking;
    }
}