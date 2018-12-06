package com.kodilla.good.patterns.flights;

import java.util.*;
import java.util.stream.Collectors;

public class FlightFinder {

    private final Flights flights;

    public FlightFinder(Flights flights) {
        this.flights = flights;
    }

    public List<Flight> findFlightsFrom(String departure) {
        List<Flight> foundedFlightsFrom = flights.getFlights().stream()
                .filter(d -> d.getDeparture().equals(departure))
                .collect(Collectors.toList());

        return foundedFlightsFrom;
    }

    public void printListFrom(List<Flight> flights, String airport) {
        if (flights.size() > 0) {
            System.out.println("\n"+"Flights from "+airport+" airport:");
            flights.stream().forEach(System.out::println);
        }
    }

    public List<Flight> findFlightsTo(String arrival)  {
        List<Flight> foundedFlightsTo = flights.getFlights().stream()
                .filter(a -> a.getArrival().equals(arrival))
                .collect(Collectors.toList());

        return foundedFlightsTo;
    }
    public void printListTo(List<Flight> flights, String airport) {
        if (flights.size() > 0) {
            System.out.println("\n"+"Flights to "+airport+" airport:");
            flights.stream().forEach(System.out::println);
        }
    }

    public Set<List<Flight>> findFlightsWithTransfer(String departure, String arrival) {

        Set<List<Flight>> flightsWithTransfer = new HashSet<>();

        flights.getFlights().stream()
                .filter(flight -> flight.getDeparture().equals(departure))
                .forEach(f -> {

                    List<Flight> temporaryConnection = flights.getFlights().stream()
                            .filter(c -> f.getArrival().equals(c.getDeparture()) && c.getArrival().equals(arrival))
                            .collect(Collectors.toList());

                    if (temporaryConnection.size() != 0) {
                        List<Flight> connection = new ArrayList<>();
                        connection.add(f);
                        connection.addAll(temporaryConnection);
                        flightsWithTransfer.add(connection);
                    }
                });


        return flightsWithTransfer;
    }
    public void printTransfers(Set<List<Flight>> transfers,String departure, String arrival){
        if(transfers.size()!=0){
            System.out.println("\n"+"Flights with transfer:");
            transfers.stream().forEach(System.out::println);
        }else {
            System.out.println("\n"+"Missing flights with transfer");
        }
    }

}
