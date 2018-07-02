package Stall;

import Visitor.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TobaccoStallTest {

    TobaccoStall tobaccoStall;
    Visitor visitor1;
    Visitor visitor2;

    @Before
    public void before(){
        tobaccoStall = new TobaccoStall("Shishacco", "Mary", "B01", 6);
        visitor1 = new Visitor("Andy", 13, 1.61, 50.00);
        visitor2 = new Visitor("Rick", 20, 2.03, 70.00);
    }

    @Test
    public void canHaveAName(){
        assertEquals("Shishacco", tobaccoStall.getName());
    }

    @Test
    public void canHaveOwnerName(){
        assertEquals("Mary", tobaccoStall.getOwnerName());
    }

    @Test
    public void canHaveParkingSpot(){
        assertEquals("B01", tobaccoStall.getParkingSpot());
    }

    @Test
    public void IsAllowed(){
        assertEquals(false, tobaccoStall.isAllowedTo(visitor1));
        assertEquals(true, tobaccoStall.isAllowedTo(visitor2));
    }
}
