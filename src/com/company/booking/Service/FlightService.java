package com.company.booking.Service;

import com.company.booking.DAO.FlightDao;
import com.company.booking.Flight;

import java.util.List;

public class FlightService {
private FlightDao flightDao;
private List<Flight> flights;

    public FlightService(FlightDao flightDao) {
        this.flightDao = flightDao;
    }

    public List<Flight> getAllFlights(){
    return flights;
}
}
