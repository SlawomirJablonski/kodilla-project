package com.kodilla.testing.shape;

import static java.lang.Math.pow;

public class Circle implements Shape {
    final double Pi = 3.14;
    double field;
    double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public String getShapeName() {
        return "circle";
    }

    @Override
    public double getField() {
        if (radius > 0) {
            field = Pi * pow(radius,2);
        }
        return field;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Circle circle = (Circle) o;

        if (Double.compare(circle.Pi, Pi) != 0) return false;
        if (Double.compare(circle.field, field) != 0) return false;
        return Double.compare(circle.radius, radius) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(Pi);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(field);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(radius);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
