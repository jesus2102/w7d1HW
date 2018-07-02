package Attraction;

import Visitor.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaygroundTest {

    Playground playground;
    Visitor visitor1;
    Visitor visitor2;

    @Before
    public void before(){
        playground = new Playground("Neverland", 6);
        visitor1 = new Visitor("Andy", 13, 1.61, 50.00);
        visitor2 = new Visitor("Rick", 20, 2.03, 70.00);
    }

    @Test
    public void canHaveAName(){
        assertEquals("Neverland", playground.getName());
    }

    @Test
    public void IsAllowed(){
        assertEquals(true, playground.isAllowedTo(visitor1));
        assertEquals(false, playground.isAllowedTo(visitor2));
    }
}
