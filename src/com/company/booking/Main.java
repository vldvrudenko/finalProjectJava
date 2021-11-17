package com.company.booking;

import com.company.booking.Controller.FlightController;
import com.company.booking.DAO.CollectionFlightDao;
import com.company.booking.DAO.FlightDao;
import com.company.booking.Service.FlightService;



import java.io.*;
import java.time.LocalDate;

import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) throws IOException {

        FlightDao collectionFlightDao = new CollectionFlightDao();
        FlightService flightService = new FlightService(collectionFlightDao);
        FlightController flightController = new FlightController(flightService);

        flightController.generateFlights();

        // System.out.println(flightController.getAllFlights());
        System.out.println(flightController.getFlightById(100));
        flightController.findFlights(LocalDate.of(2021,11,9),"Tokyo",2);
        flightController.nextFlights();




    }

}
