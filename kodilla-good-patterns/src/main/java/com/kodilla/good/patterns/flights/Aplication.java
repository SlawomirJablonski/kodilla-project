package com.kodilla.good.patterns.flights;

public class Aplication {
    public static void main(String[] args){
        FlightProcessor flightProcessor = new FlightProcessor("Berlin","London");
        flightProcessor.process();
    }
}
