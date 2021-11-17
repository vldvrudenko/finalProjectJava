package com.company.booking.test;

import com.company.booking.DAO.CollectionFlightDao;
import com.company.booking.DAO.FlightDao;
import com.company.booking.Flight;
import com.company.booking.Service.FlightService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class FlightServiceTest {
    @Mock
    private FlightDao mock ;
    @InjectMocks
    private FlightService flightService ;

    List<Flight> flights = new ArrayList<>();
    Flight test = new Flight("London");

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        test.setId(1L);
        test.setFreePlaces(1);
        test.setLocalDate(LocalDate.of(2021,11,9));
        flightService.addFlight(test);
        when(mock.getAllFlights()).thenReturn(flights);

    }

    @Test
    public void getFlightByIdTestSuccess(){
        flightService.getFlightById(1);
    }
    @Test
    public void findFlightsTestSuccess(){
        flightService.findFlights(LocalDate.of(2021,11,9),"London",1);

    }

}
