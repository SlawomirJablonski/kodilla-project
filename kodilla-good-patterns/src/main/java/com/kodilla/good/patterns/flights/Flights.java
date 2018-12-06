package com.kodilla.good.patterns.flights;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

final class Flights {

    Set<Flight> getFlights() {

        Flight flight001 = new Flight(001, "Berlin", "Amsterdam");
        Flight flight002 = new Flight(002, "Berlin", "Roma");
        Flight flight003 = new Flight(003, "Berlin", "Paris");
        Flight flight004 = new Flight(004, "Amsterdam", "Paris");
        Flight flight005 = new Flight(005, "Amsterdam", "Roma");
        Flight flight006 = new Flight(006, "Paris", "London");
        Flight flight007 = new Flight(007, "Roma", "London");
        Flight flight010 = new Flight(010, "Roma", "Berlin");
        Flight flight011 = new Flight(011, "London", "Berlin");
        Flight flight012 = new Flight(012, "London", "Paris");

        List<Flight> flightList = Arrays.asList(flight001, flight002, flight003, flight004, flight005, flight006, flight007, flight010, flight011, flight012);
        Set<Flight> flights = new HashSet<>(flightList);

        return flights;
    }

}
