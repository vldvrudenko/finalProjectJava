package com.company.booking.test;

import com.company.booking.DAO.CollectionFlightDao;
import com.company.booking.DAO.FlightDao;
import com.company.booking.Flight;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;
import org.mockito.stubbing.Answer;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class FlightDaoTest {
    @Mock
    private FlightDao mock = new CollectionFlightDao() ;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);

    }
    @Test
    public void getAllFlightsTest(){
        List<Flight> flights = new ArrayList<>();
        Flight test = new Flight("London");
       flights.add(test);
        when(mock.getAllFlights()).thenReturn(flights);
    }
    @Test
    public void addFlightTest(){
        List<Flight> flights = new ArrayList<>();
        Flight test = new Flight("London");
        flights.add(test);
      when(mock.getAllFlights()).thenReturn(flights);
      mock.addFlight(test);
      Mockito.verify(mock).addFlight(test);
    }



}




