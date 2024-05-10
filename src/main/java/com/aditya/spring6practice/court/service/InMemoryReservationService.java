package com.aditya.spring6practice.court.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.util.StringUtils;

import com.aditya.spring6practice.court.domain.Player;
import com.aditya.spring6practice.court.domain.Reservation;
import com.aditya.spring6practice.court.domain.SportType;

public class InMemoryReservationService implements ReservationService {

    private final List<Reservation> reservations = Collections.synchronizedList(new ArrayList<>());

    public InMemoryReservationService() {
	var girish = new Player("Girish");
	var satish = new Player("Satish");
	var date = LocalDate.of(2024, 5, 20);

	reservations.add(new Reservation("Court 1", date, 15, girish, new SportType(1, "TENNIS")));
	reservations.add(new Reservation("Court 2", date, 15, satish, new SportType(1, "TENNIS")));
    }

    @Override
    public List<Reservation> query(String courtName) {
	return this.reservations.stream()
		.filter(r -> StringUtils.startsWithIgnoreCase(r.getCourtName(), courtName))
		.collect(Collectors.toList());
    }

}
