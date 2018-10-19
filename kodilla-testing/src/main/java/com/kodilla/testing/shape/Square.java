package com.kodilla.testing.shape;

import static java.lang.Math.pow;

public class Square implements Shape {
    double side;
    double field;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public String getShapeName() {
        return "square";
    }

    @Override
    public double getField() {
        if (side>0){
            field = pow(side,2);
        }
        return field;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Square square = (Square) o;

        if (Double.compare(square.side, side) != 0) return false;
        return Double.compare(square.field, field) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(side);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(field);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
