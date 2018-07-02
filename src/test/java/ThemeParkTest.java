import Attraction.RollerCoaster;
import Stall.IceCreamStall;
import Visitor.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {

    ThemePark themePark;
    RollerCoaster rollerCoaster;
    IceCreamStall iceCreamStall;
    Visitor visitor;

    @Before
    public void before(){
        themePark = new ThemePark();
        rollerCoaster = new RollerCoaster("Dragon Khan", 9);
        iceCreamStall = new IceCreamStall("Italian Cream", "Luiggi", "B26", 8);
        visitor = new Visitor("Rick", 20, 2.03, 70.00);
    }

    @Test
    public void canCountAttractions(){
        assertEquals(0, themePark.countAttractions());
    }

    @Test
    public void canAddAttractions(){
        themePark.addAttraction(rollerCoaster);
        assertEquals(1, themePark.countAttractions());
    }

    @Test
    public void canCountStalls(){
        assertEquals(0, themePark.countStalls());
    }

    @Test
    public void canAddStalls(){
        themePark.addStall(iceCreamStall);
        assertEquals(1, themePark.countStalls());
    }

    @Test
    public void canCountNumberReviews(){
        assertEquals(0, themePark.numberOfReviews());
    }

    @Test
    public void canHaveRewiews(){
        themePark.addStall(iceCreamStall);
        themePark.addAttraction(rollerCoaster);
        themePark.getAllReviewed();
        assertEquals(2, themePark.numberOfReviews());
    }

    @Test
    public void canGetVisited(){
        assertEquals("Rick loves the Dragon Khan", themePark.visit(visitor, rollerCoaster));
    }
}
