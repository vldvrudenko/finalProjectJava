package com.company.booking.DAO;

import com.company.booking.Flight;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CollectionFlightDao implements FlightDao {
    private List<Flight> flights = new ArrayList<>();
    private Long counter = 1L;
    private static final int min = 0;
    private static final int max = 49;
    Random rnd = new Random();

    @Override
    public List<Flight> getAllFlights() {
        return flights;
    }

    @Override
    public Flight addFlight(Flight flight) {
        flight.setId(counter++);
        flight.setFreePlaces(rnd.nextInt((max - min) + 1) + min);
        flight.setLocalDate(createRandomDate(2021));
        flight.setLocalTime(createRandomTime());
        flights.add(flight);
        return flight;
    }
    public  int createRandomIntBetween(int start, int end) {
        return start + (int) Math.round(Math.random() * (end - start));
    }

    public LocalTime createRandomTime(){
        int hours = createRandomIntBetween(0, 23);
        int minutes = createRandomIntBetween(0, 59);
        return LocalTime.of(hours,minutes);
    }
    public LocalDate createRandomDate(int startYear) {
        int day = createRandomIntBetween(1, 28);
        int month = createRandomIntBetween(11, 12);
        int year = 2021;
        return LocalDate.of(year, month, day);
    }

}
