package Attraction;

import Visitor.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RollerCoasterTest {

    RollerCoaster rollerCoaster;
    Visitor visitor1;
    Visitor visitor2;
    Visitor visitor3;

    @Before
    public void before(){
        rollerCoaster = new RollerCoaster("Dragon Khan", 9);
        visitor1 = new Visitor("Andy", 11, 1.61, 50.00);
        visitor2 = new Visitor("Rick", 20, 2.03, 70.00);
        visitor3 = new Visitor("Rick", 9, 1.33, 10.00);
    }

    @Test
    public void canHaveAName(){
        assertEquals("Dragon Khan", rollerCoaster.getName());
    }

    @Test
    public void IsAllowed1() {
        assertEquals(false, rollerCoaster.isAllowedTo(visitor1));
    }

    @Test
    public void IsAllowed2() {
        assertEquals(true, rollerCoaster.isAllowedTo(visitor2));
    }

    @Test
    public void IsAllowed3(){
        assertEquals(false, rollerCoaster.isAllowedTo(visitor3));
    }

    @Test
    public void hasRating(){
        assertEquals(9, rollerCoaster.getRating());
    }
}
