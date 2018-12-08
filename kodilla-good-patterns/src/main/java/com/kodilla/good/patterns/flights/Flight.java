package com.kodilla.good.patterns.flights;

public class Flight {

    private int flightId;
    private String departure;
    private String arrival;


    public Flight(int flightId, String departure, String arrival) {
        this.flightId = flightId;
        this.departure = departure;
        this.arrival = arrival;
    }

    public int getFlightId() {
        return flightId;
    }

    public String getDeparture() {
        return departure;
    }

    public String getArrival() {
        return arrival;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Flight flight = (Flight) o;

        if (flightId != flight.flightId) return false;
        if (!departure.equals(flight.departure)) return false;
        return arrival.equals(flight.arrival);
    }

    @Override
    public int hashCode() {
        int result = flightId;
        result = 31 * result + departure.hashCode();
        result = 31 * result + arrival.hashCode();
        return result;
    }
    @Override
    public String toString() {
        return "Flight "+getFlightId()+" from " + getDeparture() + " to " + getArrival();
    }
}


