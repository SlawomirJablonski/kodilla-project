package com.kodilla.exception.test;

import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;


public class FlightFinder {


    public ArrayList<Flight> getFlights() {

        Flight flight001 = new Flight("Berlin", "Amstrdam");
        Flight flight002 = new Flight("Berlin", "Roma");
        Flight flight003 = new Flight("Berlin", "Paris");

        ArrayList<Flight> flights = new ArrayList<>();

        flights.add(flight001);
        flights.add(flight002);
        flights.add(flight003);

        return flights;
    }

    public Map<String, Boolean> findFlight(Flight flight) throws RouteNotFoundException {

        Map<String, Boolean> map = getFlights().stream()
                .filter(d -> d.getDepartureAirport().equals(flight.getDepartureAirport()))
                .filter(a -> a.getArrivalAirport().equals(flight.getArrivalAirport()))
                .collect(Collectors.toMap(b -> b.getArrivalAirport(), b -> b.getArrivalAirport().isEmpty()));

        if (map.size() == 0) {

            throw new RouteNotFoundException();
        }
        return map;
    }
}
