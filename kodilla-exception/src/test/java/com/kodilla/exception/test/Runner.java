package com.kodilla.exception.test;


public class Runner {
    public static void main(String[] args){

        Flight flight004 = new Flight("Berlin", "Oslo");

        FlightFinder flightFinder = new FlightFinder();

        try {

            flightFinder.findFlight(flight004);

        } catch (RouteNotFoundException r){

            System.out.println(r.getMessage());

        }
    }
}
