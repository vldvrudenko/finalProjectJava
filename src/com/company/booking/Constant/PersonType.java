package com.company.booking.Constant;

public enum PersonType {

    CUSTOMER("Customer"),
    PASSENGER("Passenger");

    private final String name;

    PersonType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
