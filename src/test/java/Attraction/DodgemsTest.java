package Attraction;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DodgemsTest {

    Dodgems dodgems;

    @Before
    public void before(){
        dodgems = new Dodgems("Wild Buffalos", 6);
    }

    @Test
    public void canHaveAName(){
        assertEquals("Wild Buffalos", dodgems.getName());
    }
}
