package com.minibootcamp;
import org.junit.Test;
import static org.junit.Assert.*;
public class CartesianSystemTest{
    @Test
    public void testAllZeros(){
        CartesianSystem cs = new CartesianSystem();
        cs.setCoordinateX1(0.0);
        cs.setCoordinateX2(0.0);
        cs.setCoordinateY1(0.0);
        cs.setCoordinateY2(0.0);
        assertEquals(0.0,cs.calculateLength(),0.0);
    }

    @Test public void testNonZeros(){
        CartesianSystem cs = new CartesianSystem();
        cs.setCoordinateX1(1.0);
        cs.setCoordinateX2(2.0);
        cs.setCoordinateY1(3.0);
        cs.setCoordinateY2(4.0);
        assertEquals(1.4142135623730951,cs.calculateLength(),0.0);
    }
}
