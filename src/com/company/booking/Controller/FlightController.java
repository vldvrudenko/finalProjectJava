package com.company.booking.Controller;

import com.company.booking.Flight;
import com.company.booking.Service.FlightService;

import java.util.ArrayList;
import java.util.List;

public class FlightController {
    private FlightService flightService;
    private List<Flight> flights = new ArrayList<>();
    private Flight flight;

    public FlightController(FlightService flightService) {
        this.flightService = flightService;
    }

    public List<Flight> getAllFlights(){
    return flights;
}
    public Flight getFlightById(int id){
        return flights.get(id);
    }
    public Flight addFlight(Flight flight){
        flights.add(flight);
        return flight;
    }
}
