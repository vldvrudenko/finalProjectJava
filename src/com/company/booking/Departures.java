package com.company.booking;

public enum Departures {
    Kyiv("Kyiv");

    Departures() {
    }

    private String city;

    Departures(String city){
     this.city = city;
   }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
