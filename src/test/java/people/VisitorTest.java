package people;

import attractions.RollerCoaster;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.theories.suppliers.TestedOn;
import stalls.IceCreamStall;
import stalls.ParkingSpot;

import static org.junit.Assert.assertEquals;

public class VisitorTest {

    Visitor visitor;

    @Before
    public void before(){
        visitor = new Visitor(14, 1.2, 40.0);
    }

    @Test
    public void hasAge() {
        assertEquals(14, visitor.getAge());
    }

    @Test
    public void hasHeight() {
        assertEquals(1.2, visitor.getHeight(), 0.1);
    }

    @Test
    public void hasMoney() {
        assertEquals(40.0, visitor.getMoney(), 0.1);
    }

    @Test
    public void hasEmptyVisitedAttractionArray(){
        assertEquals(0 , visitor.getNumberOfVisitedAttractions());
    }

    @Test
    public void canAddAttraction(){
        RollerCoaster rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        IceCreamStall iceCreamStall = new IceCreamStall("Dream Cones", "Vanilla Ice", ParkingSpot.A4, 4);
        visitor.addVisitedAttraction(rollerCoaster);
        visitor.addVisitedAttraction(iceCreamStall);
        assertEquals(2, visitor.getNumberOfVisitedAttractions());
    }
}
