package com.company.booking.DAO;

import com.company.booking.Flight;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CollectionFlightDao implements FlightDao {
    private List<Flight> flights = new ArrayList<>();
    private Long counter = 1L;



    @Override
    public List<Flight> getAllFlights() {
        return flights;
    }

    @Override
    public Flight addFlight(Flight flight) {
        flight.setId(counter++);
        flights.add(flight);
        return flight;
    }

//    @Override
//    public Flight getFlightById(int id) {
//        return flights
//                .stream()
//                .filter((f) -> f.getId() == id)
//                .findFirst()
//                .orElse(null);
//    }
}
