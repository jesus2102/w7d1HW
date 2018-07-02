package Visitor;

import Visitor.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VisitorTest {

    Visitor visitor;

    @Before
    public void before(){
        visitor = new Visitor("Andy", 20, 1.78, 50.00);
    }

    @Test
    public void canHaveAName(){
        assertEquals("Andy", visitor.getName());
    }

    @Test
    public void canHaveAge(){
        assertEquals(20, visitor.getAge());
    }

    @Test
    public void canHaveHeight(){
        assertEquals(1.78, visitor.getHeight(), 0.00);
    }

    @Test
    public void canHaveMoney(){
        assertEquals(50.00, visitor.getMoney(), 0.00);
    }
}
