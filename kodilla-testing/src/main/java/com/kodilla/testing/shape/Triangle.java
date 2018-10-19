package com.kodilla.testing.shape;

import static java.lang.StrictMath.sqrt;

public class Triangle implements Shape {
    double aSide;
    double bSide;
    double cSide;
    double field;

    public Triangle(double aSide, double bSide, double cSide) {
        this.aSide = aSide;
        this.bSide = bSide;
        this.cSide = cSide;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Triangle triangle = (Triangle) o;

        if (Double.compare(triangle.aSide, aSide) != 0) return false;
        if (Double.compare(triangle.bSide, bSide) != 0) return false;
        if (Double.compare(triangle.cSide, cSide) != 0) return false;
        return Double.compare(triangle.field, field) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(aSide);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(bSide);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(cSide);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(field);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String getShapeName() {
        return "Triangle";
    }

    @Override
    public double getField() {
            if (aSide+bSide>cSide && aSide+cSide>bSide && cSide+bSide>aSide){
            double p = (aSide+bSide+cSide)/2;
            field =sqrt( p*(p-aSide)*(p-bSide)*(p-cSide));
        }
        return field;
    }
}
