package com.company.booking.Service;

import com.company.booking.DAO.FlightDao;
import com.company.booking.Flight;

import java.util.ArrayList;
import java.util.List;

public class FlightService {
    private FlightDao flightDao;


    public FlightService(FlightDao flightDao) {
        this.flightDao = flightDao;
    }

    public List<Flight> getAllFlights() {
        return flightDao.getAllFlights();
    }

    //public Flight getFlightById(int index){
//
//        return flights.get(index);
//}
    public Flight addFlight(Flight flight) {
     return   flightDao.addFlight(flight);

    }
    public  List<Flight> generateFlights(){
        for (int i = 0;i < 20 ;i++){
            flightDao.addFlight(new Flight("London"));
            flightDao.addFlight(new Flight("Paris"));
            flightDao.addFlight(new Flight("New-York"));
            flightDao.addFlight(new Flight("Lviv"));
            flightDao.addFlight(new Flight("Tokyo"));
            flightDao.addFlight(new Flight("Amsterdam"));
            flightDao.addFlight(new Flight("Milan"));
        }
        return flightDao.getAllFlights();
    }
}
