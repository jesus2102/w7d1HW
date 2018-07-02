package Attraction;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ParkTest {

    Park park;

    @Before
    public void before(){
        park = new Park("Pirate's Bay", 5);
    }

    @Test
    public void canHaveAName(){
        assertEquals("Pirate's Bay", park.getName());
    }
}
