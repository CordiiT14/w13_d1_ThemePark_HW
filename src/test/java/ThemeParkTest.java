import attractions.Dodgems;
import attractions.RollerCoaster;
import behaviours.IReviewed;
import org.junit.Before;
import org.junit.Test;
import people.Visitor;
import stalls.CandyflossStall;
import stalls.ParkingSpot;

import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {

    private ThemePark jurassicPark;
    private Dodgems dodgems;
    private RollerCoaster rollerCoaster;
    private CandyflossStall candyflossStall;
    private ArrayList<IReviewed> parkAttractionsAndStalls;

    @Before
    public void before(){
        parkAttractionsAndStalls = new ArrayList<>();
        parkAttractionsAndStalls.add(dodgems = new Dodgems("Bumper Cars", 5));
        parkAttractionsAndStalls.add(rollerCoaster = new RollerCoaster("Blue Ridge", 10));
        parkAttractionsAndStalls.add(candyflossStall = new CandyflossStall("Candy Land", "Harry Belafonte", ParkingSpot.A1, 5));
        jurassicPark = new ThemePark(parkAttractionsAndStalls);
    }

    @Test
    public void hasArrayOfIReviewedItems(){
        assertEquals(parkAttractionsAndStalls, jurassicPark.getAllReviewed());
    }

    @Test
    public void canVisit(){
        Visitor visitor = new Visitor(19, 165, 50.00);
        jurassicPark.visit(visitor, rollerCoaster);
        assertEquals(1, rollerCoaster.getVisitCount());
        assertEquals(rollerCoaster, visitor.getVisitedAttractions().get(0));
    }

    @Test
    public void canGetAllReviews(){
        HashMap<String, Integer> parkAttractionReviews = new HashMap<>();
        parkAttractionReviews.put("Bumper Cars", 5);
        parkAttractionReviews.put("Blue Ridge", 10);
        parkAttractionReviews.put("Candy Land", 5);
        assertEquals(parkAttractionReviews, jurassicPark.getAllReviews());
    }
}
