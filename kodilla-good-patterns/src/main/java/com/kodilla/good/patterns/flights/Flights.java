package com.kodilla.good.patterns.flights;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

final class Flights {

    Set<Flight> getFlights() {
        Set<Flight> flights = new HashSet<>();
        flights.add(new Flight(001, "Berlin", "Amsterdam"));
        flights.add(new Flight(002, "Berlin", "Roma"));
        flights.add(new Flight(003, "Berlin", "Paris"));
        flights.add(new Flight(004, "Amsterdam", "Paris"));
        flights.add(new Flight(005, "Amsterdam", "Roma"));
        flights.add(new Flight(006, "Paris", "London"));
        flights.add(new Flight(007, "Roma", "London"));
        flights.add(new Flight(010, "Roma", "Berlin"));
        flights.add(new Flight(011, "London", "Berlin"));
        flights.add(new Flight(012, "London", "Paris"));

        return flights;
    }

}
