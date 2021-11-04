package com.company.booking;

import com.company.booking.Controller.FlightController;
import com.company.booking.DAO.CollectionFlightDao;
import com.company.booking.DAO.FlightDao;
import com.company.booking.Service.FlightService;

public class Main {

    public static void main(String[] args) {

        FlightDao collectionFlightDao = new CollectionFlightDao();
        FlightService flightService =new FlightService(collectionFlightDao);
        FlightController flightController  = new FlightController(flightService);
        System.out.println(flightController.getAllFlights());


    }
}
