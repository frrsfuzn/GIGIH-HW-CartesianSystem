package com.minibootcamp;

public class Example{
    public static void main(String[] args){
        CartesianSystem cs = new CartesianSystem();
        cs.setCoordinateX1(0.0);
        cs.setCoordinateX2(0.0);
        cs.setCoordinateY1(0.0);
        cs.setCoordinateY2(0.0);
        System.out.println(cs.calculateLength());
    }
}
