package com.company.booking.Service;

import com.company.booking.DAO.FlightDao;
import com.company.booking.Flight;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;
import java.util.stream.Collectors;

public class FlightService {
    private FlightDao flightDao;
    private static final int min = 0;
    private static final int max = 49;
    Random rnd = new Random();



    public FlightService(FlightDao flightDao) {
        this.flightDao = flightDao;
    }

    public List<Flight> getAllFlights() {
        return flightDao.getAllFlights();
    }

public Flight getFlightById(int id) {
      return flightDao.getAllFlights()
                .stream()
                .filter((f) -> f.getId() == id)
              .findFirst()
              .orElse(null);
    }

    public  void findFlights (LocalDate date,String destination,int amountOfTickets){
          flightDao.getAllFlights()
                 .stream()
                 .filter((f ->f.getLocalDate().isEqual(date)
                         && f.getDestination().contains(destination)
                         && f.getFreePlaces() > amountOfTickets))
                  .sorted(Comparator.comparing(Flight::getLocalDate))
                  .forEach(System.out::println);
    }
    public void nextFlights (){
         flightDao.getAllFlights()
                .stream()
                .filter((f -> f.getLocalDate().isEqual(LocalDate.now())
                        && f.getLocalTime().isAfter(LocalTime.now())))
                .sorted(Comparator.comparing(Flight::getLocalTime))
                 .forEach(System.out::println);
    }


    public Flight addFlight(Flight flight) {
        return flightDao.addFlight(flight);
    }

    public Flight generateData(Flight flight) {
        flight.setLocalDate(createRandomDate(2021));
        flight.setLocalTime(createRandomTime());
        flight.setFreePlaces(rnd.nextInt((max - min) + 1) + min);
        flight.setDestination(createRandomCity());
        return flight;
    }

    public void generateFlights() {
        for (int i = 0; i < 700; i++) {
            flightDao.addFlight(generateData(new Flight()));

        }
    }

    public String createRandomCity() {
        ArrayList<String> places = new ArrayList<String>(
                Arrays.asList("Buenos Aires", "Rome", "London", "Tokyo",
                        "Lviv", "Paris", "Minsk", "Sofia", "San Jose", "Cairo",
                        "Tbilisi","Berlin","Milan","Athens","New-York","Dublin"));

        int index = new Random().nextInt(places.size());
        return places.get(index);
    }

    public int createRandomIntBetween(int start, int end) {
        return start + (int) Math.round(Math.random() * (end - start));
    }

    public LocalTime createRandomTime() {
        int hours = createRandomIntBetween(0, 23);
        int minutes = createRandomIntBetween(0, 59);
        return LocalTime.of(hours, minutes);
    }

    public LocalDate createRandomDate(int startYear) {
        int day = createRandomIntBetween(9, 28);
       // int month = createRandomIntBetween(11, 12);
        int month = 11;
        int year = 2021;
        return LocalDate.of(year, month, day);
    }

}
