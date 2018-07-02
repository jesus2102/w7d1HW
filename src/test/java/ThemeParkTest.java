import Attraction.RollerCoaster;
import Stall.IceCreamStall;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {

    ThemePark themePark;
    RollerCoaster rollerCoaster;
    IceCreamStall iceCreamStall;

    @Before
    public void before(){
        themePark = new ThemePark();
        rollerCoaster = new RollerCoaster("Dragon Khan");
        iceCreamStall = new IceCreamStall("Italian Cream", "Luiggi", "B26");
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
}
