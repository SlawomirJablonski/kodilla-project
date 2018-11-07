//sth
package com.kodilla.exception.test;

public class RouteNotFoundException extends Exception{
    public RouteNotFoundException(){
        super("Missing connection with desired destination");
    }
}
