package com.company.booking;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Objects;

public class Flight {
    private int id ;
    private  String destination ;
    private int freePlaces;
    private Departures departure ;
    private LocalDate localDate;
    private LocalTime localTime;


    public Flight() {
        this.departure = Departures.Kyiv;
    }
    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    public LocalTime getLocalTime() {
        return localTime;
    }

    public void setLocalTime(LocalTime localTime) {
        this.localTime = localTime;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getFreePlaces() {
        return freePlaces;
    }

    public void setFreePlaces(int freePlaces) {
        this.freePlaces = freePlaces;
    }

    public Departures getDeparture() {
        return departure;
    }

    public void setDeparture(Departures departure) {
        this.departure = departure ;
    }

@Override
public String toString(){
return "Рейс("+ id +"):дата-"+localDate +",время-"+localTime +",отправление из-"+departure+",место назначения-"
        +destination+",свободных мест-"+freePlaces ;
}
@Override
public boolean equals(Object o){
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Flight flight = (Flight) o;
    return id == flight.id && destination== flight.destination
            && departure == flight.departure && freePlaces == flight.freePlaces
            && localTime == flight.localTime && localDate == flight.localDate;
}

@Override
    public int hashCode(){
return Objects.hash(id,localDate,localTime,departure,destination,freePlaces);
}
}
