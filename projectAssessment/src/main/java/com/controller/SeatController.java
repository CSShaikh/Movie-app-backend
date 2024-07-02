package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.Seat;
import com.service.SeatService;

@RestController
@RequestMapping("/seats")
public class SeatController {

    @Autowired
    private SeatService seatService;

    @GetMapping("/available")
    public List<Seat> getAvailableSeats() {
        return seatService.getAvailableSeats();
    }

    @PostMapping("/lock/{id}")
    public Seat lockSeat(@PathVariable Long id) {
        return seatService.lockSeat(id);
    }

    @PostMapping("/release/{id}")
    public Seat releaseSeat(@PathVariable Long id) {
        return seatService.releaseSeat(id);
    }
}