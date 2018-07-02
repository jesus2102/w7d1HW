package Stall;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CandyFlossStallTest {

    CandyFlossStall candyFlossStall;

    @Before
    public void before(){
        candyFlossStall = new CandyFlossStall("Candy World", "Lisa", "A12", 7);
    }

    @Test
    public void canHaveAName(){
        assertEquals("Candy World", candyFlossStall.getName());
    }

    @Test
    public void canHaveOwnerName(){
        assertEquals("Lisa", candyFlossStall.getOwnerName());
    }

    @Test
    public void canHaveParkingSpot(){
        assertEquals("A12", candyFlossStall.getParkingSpot());
    }
}
