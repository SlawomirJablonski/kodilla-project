package com.kodilla.good.patterns.flights;

public class FlightNotFoundException extends Exception {
    public FlightNotFoundException() {
        super("Missing flight connection");
    }
}
