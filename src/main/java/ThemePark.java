import attractions.Attraction;
import behaviours.IReviewed;
import people.Visitor;
import stalls.Stall;

import java.util.ArrayList;

public class ThemePark {

    private ArrayList<IReviewed> allAttractionsAndStalls;

    public ThemePark(ArrayList<IReviewed> allAttractionsAndStalls){
        this.allAttractionsAndStalls = allAttractionsAndStalls;
    }

    public ArrayList<IReviewed> getAllReviewed(){
        return this.allAttractionsAndStalls;
    }

    public void visit(Visitor visitor, Attraction attraction){
        attraction.setVisitCount();
        visitor.addVisitedAttraction(attraction);
    }
}
