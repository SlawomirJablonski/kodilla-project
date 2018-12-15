package com.kodilla.exception.test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class FlightFinder {


    public List<Flight> getFlights() {

        Flight flight001 = new Flight("Berlin", "Amsterdam");
        Flight flight002 = new Flight("Berlin", "Roma");
        Flight flight003 = new Flight("Berlin", "Paris");

        List<Flight> flights = Arrays.asList(flight001, flight002, flight003);

        return flights;
    }

    public Map<String, Boolean> findFlight(Flight flight) throws RouteNotFoundException {

        Map<String, Boolean> map = getFlights().stream()
                .filter(d -> d.getDepartureAirport().equals(flight.getDepartureAirport()))
                .filter(a -> a.getArrivalAirport().equals(flight.getArrivalAirport()))
                .collect(Collectors.toMap(Flight::getArrivalAirport, b -> b.getArrivalAirport().isEmpty()));

        if (map.size() == 0) {

            throw new RouteNotFoundException();
        }
        return map;
    }
}
