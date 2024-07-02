package com.service;

import java.util.List;

import com.model.Seat;

public interface SeatService {
	
	public List<Seat> getAvailableSeats();
    
	public Seat lockSeat(Long seatId);
    
	public Seat releaseSeat(Long seatId);
}
