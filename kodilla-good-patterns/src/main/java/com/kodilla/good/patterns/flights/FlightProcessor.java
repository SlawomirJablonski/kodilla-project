package com.kodilla.good.patterns.flights;

import java.util.List;
import java.util.Set;

public class FlightProcessor {
    private Flights flights = new Flights();
    private FlightFinder flightFinder = new FlightFinder(flights);
    private String requestedDeparture;
    private String requestedArrival;

    public FlightProcessor(String requestedDeparture, String requestedArrival) {
        this.requestedDeparture = requestedDeparture;
        this.requestedArrival = requestedArrival;
    }

    public void process() {

        List<Flight> departures = flightFinder.findFlightsFrom(requestedDeparture);
        flightFinder.printListFrom(departures, requestedDeparture);
        List<Flight> arrivals = flightFinder.findFlightsTo(requestedArrival);
        flightFinder.printListTo(arrivals, requestedArrival);
        Set<List<Flight>> transfers = flightFinder.findFlightsWithTransfer(requestedDeparture, requestedArrival);
        flightFinder.printTransfers(transfers,requestedDeparture,requestedArrival);
    }
}
