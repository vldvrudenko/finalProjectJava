package com.company.booking.Controller;

import com.company.booking.Flight;
import com.company.booking.Service.FlightService;

import java.util.List;

public class FlightController {
    private FlightService flightService;
    private List<Flight> flights;

    public FlightController(FlightService flightService) {
        this.flightService = flightService;
    }

    public List<Flight> getAllFlights(){
    return flights;
}
}
