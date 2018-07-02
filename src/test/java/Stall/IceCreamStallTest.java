package Stall;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IceCreamStallTest {

    IceCreamStall iceCreamStall;

    @Before
    public void before(){
        iceCreamStall = new IceCreamStall("Italian Cream", "Luiggi", "B26", 8);
    }

    @Test
    public void canHaveAName(){
        assertEquals("Italian Cream", iceCreamStall.getName());
    }

    @Test
    public void canHaveOwnerName(){
        assertEquals("Luiggi", iceCreamStall.getOwnerName());
    }

    @Test
    public void canHaveParkingSpot(){
        assertEquals("B26", iceCreamStall.getParkingSpot());
    }
}
