package com.company.booking;

import com.company.booking.Controller.FlightController;
import com.company.booking.DAO.CollectionFlightDao;
import com.company.booking.DAO.FlightDao;
import com.company.booking.Service.FlightService;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        FlightDao collectionFlightDao = new CollectionFlightDao();
        FlightService flightService = new FlightService(collectionFlightDao);
        FlightController flightController  = new FlightController(flightService);


        Flight test = new Flight();
        test.setLocalDate(LocalDate.of(2021, 1, 1));
        test.setLocalTime(LocalTime.of(12, 10));
        test.setId(1);
        test.setDestination("London");
        //System.out.println(test.toString());
        flightController.addFlight(test);


        System.out.println(flightController.getAllFlights());
        System.out.println(flightController.getFlightById(0));


    }
}
