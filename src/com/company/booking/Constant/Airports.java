package com.company.booking.Constant;

public enum Airports {
    KBP("Kiev Boryspil"),
    NEWYORK("New York"),
    DUBAI("Dubai");

    private final String name;

    Airports(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
