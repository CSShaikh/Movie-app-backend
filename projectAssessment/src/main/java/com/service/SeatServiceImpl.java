package com.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.SeatRepository;
import com.model.Seat;

@Service
public class SeatServiceImpl implements SeatService {

    @Autowired
    private SeatRepository seatRepo;

    @Override
    public List<Seat> getAvailableSeats() {
        return seatRepo.findAll().stream()
                .filter(Seat::isAvailable)
                .collect(Collectors.toList());
    }

    @Override
    public Seat lockSeat(Long seatId) {
        Seat seat = seatRepo.findById(seatId).orElse(null);
        if (seat != null && seat.isAvailable()) {
            seat.setLocked(true);
            seat.setAvailable(false);
            seatRepo.save(seat);
        }
        return seat;
    }

    @Override
    public Seat releaseSeat(Long seatId) {
        Seat seat = seatRepo.findById(seatId).orElse(null);
        if (seat != null && seat.isLocked()) {
            seat.setLocked(false);
            seat.setAvailable(true);
            seatRepo.save(seat);
        }
        return seat;
    }
}
