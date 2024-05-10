package com.aditya.spring6practice.court.service;

import java.util.List;

import com.aditya.spring6practice.court.domain.Reservation;

public interface ReservationService {
    
    List<Reservation> query(String courtName);

}
