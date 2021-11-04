package com.company.booking.Service;

import com.company.booking.DAO.FlightDao;
import com.company.booking.Flight;

import java.util.ArrayList;
import java.util.List;

public class FlightService {
private FlightDao flightDao;
private List<Flight> flights = new ArrayList<>();

    public FlightService(FlightDao flightDao) {
        this.flightDao = flightDao;
    }

    public List<Flight> getAllFlights(){
    return flights;
}
public Flight getFlightById(int index){

        return flights.get(index);
}
public Flight addFlight(Flight flight){
        flights.add(flight);
    return flight;
}
}
