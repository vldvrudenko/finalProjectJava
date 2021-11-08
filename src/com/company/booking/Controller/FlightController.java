package com.company.booking.Controller;

import com.company.booking.Flight;
import com.company.booking.Service.FlightService;


import java.util.List;
import java.util.Optional;

public class FlightController {
    private FlightService flightService;



    public FlightController(FlightService flightService) {
        this.flightService = flightService;
    }


    public List<Flight> getAllFlights() {
        return flightService.getAllFlights();
    }

     public Optional<Flight> getFlightById(int id){
    return flightService.getFlightById(id);
     }
    public Flight addFlight(Flight flight) {
        return flightService.addFlight(flight);

    }

    public void generateFlights() {
        flightService.generateFlights();

    }
}
