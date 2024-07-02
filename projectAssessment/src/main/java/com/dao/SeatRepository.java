package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.model.Seat;

public interface SeatRepository extends JpaRepository<Seat, Long> {

}
