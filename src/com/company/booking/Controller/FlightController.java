package com.company.booking.Controller;

import com.company.booking.Flight;
import com.company.booking.Service.FlightService;

import java.util.ArrayList;
import java.util.List;

public class FlightController {
    private FlightService flightService;


    public FlightController(FlightService flightService) {
        this.flightService = flightService;
    }

    public List<Flight> getAllFlights() {
        return flightService.getAllFlights();
    }

    // public Flight getFlightById(int id){
    //return flightsS.get(id);
    // }
    public Flight addFlight(Flight flight) {
        return flightService.addFlight(flight);

    }

    public void generateFlights() {
        flightService.generateFlights();
    }
}
