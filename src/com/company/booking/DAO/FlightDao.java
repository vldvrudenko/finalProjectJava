package com.company.booking.DAO;

import com.company.booking.Flight;

import java.util.List;

public interface FlightDao {
List<Flight> getAllFlights();
Flight addFlight(Flight flight);
//Flight getFlightById(int id);

}
