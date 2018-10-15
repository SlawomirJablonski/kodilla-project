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
    public String getShapeName() {
        return "Triangle";
    }

    @Override
    public double getField() {
        if (aSide>0&&bSide>0&&cSide>0){
            double p = (aSide+bSide+cSide)/2;
            field =sqrt( p*(p-aSide)*(p-bSide)*(p-cSide));
        }
        return field;
    }
}
