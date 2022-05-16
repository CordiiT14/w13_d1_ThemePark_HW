package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import javax.swing.text.View;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
    }

    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void canCheckIfVisitorTallAndOldEnoughTrue(){
        Visitor visitor = new Visitor(13, 146, 20.00);
        assertEquals(true, rollerCoaster.isAllowedTo(visitor));
    }

    @Test
    public void canCheckIfVisitorTallAndOldEnoughFalse(){
        Visitor visitor = new Visitor(12 , 146, 20.00);
        assertEquals(false, rollerCoaster.isAllowedTo(visitor));
    }

    @Test
    public void hasDefaultPrice(){
        Visitor visitor = new Visitor(18 , 190, 30.00);
        assertEquals(8.40, rollerCoaster.priceFor(visitor), 0.0);
    }

    @Test
    public void canChargeDoubleForTallVisitor(){
        Visitor visitor = new Visitor(18 , 203, 50.00);
        assertEquals(16.80, rollerCoaster.priceFor(visitor), 0.0);
    }
}
