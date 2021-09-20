package com.minibootcamp;

import java.lang.Math;

public class CartesianSystem{
    private double coordinateX1, coordinateX2, coordinateY1, coordinateY2;

    public void setCoordinateX1 (double coordinateX1){
        this.coordinateX1 = coordinateX1;
    }

    public void setCoordinateX2 (double coordinateX2){
        this.coordinateX2 = coordinateX2;
    }

    public void setCoordinateY1 (double coordinateY1){
        this.coordinateY1 = coordinateY1;
    }

    public void setCoordinateY2 (double coordinateY2){
        this.coordinateY2 = coordinateY2;
    }

    public double calculateLength(){
        double result = Math.sqrt(
                Math.pow(this.coordinateX2 - this.coordinateX1, 2) + Math.pow(this.coordinateY2 - this.coordinateY1, 2)
        );
        return result;
    }
}
