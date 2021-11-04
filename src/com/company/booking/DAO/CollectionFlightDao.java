package com.company.booking.DAO;

import com.company.booking.Flight;

import java.util.ArrayList;
import java.util.List;

public class CollectionFlightDao implements FlightDao {
    private List<Flight> flights = new ArrayList<>();



    @Override
    public List<Flight> getAllFlights() {
        return flights;
    }

    @Override
    public Flight addFlight(Flight flight) {
        flights.add(flight);
        return flight;
    }
}
