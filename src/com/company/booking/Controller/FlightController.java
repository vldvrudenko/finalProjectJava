package com.company.booking.Controller;

import com.company.booking.Flight;
import com.company.booking.Service.FlightService;
import java.time.LocalDate;

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

    public Flight getFlightById(int id){
        return flightService.getFlightById(id);
    }
    public void findFlights (LocalDate date, String destination, int amountOfTickets){
        flightService.findFlights(date,destination,amountOfTickets);
    }
    public void nextFlights(){
        flightService.nextFlights();
    }
    public Flight addFlight(Flight flight) {
        return flightService.addFlight(flight);

    }

    public void generateFlights() {
        flightService.generateFlights();

    }
}
