package com.service;

import com.model.Booking;

public interface BookingService {
	
	public Booking reserve(Booking booking);
    public Booking confirm(Long bookingId);
}
