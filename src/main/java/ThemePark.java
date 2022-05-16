import attractions.Attraction;
import attractions.RollerCoaster;
import behaviours.IReviewed;
import people.Visitor;
import stalls.Stall;
import stalls.TobaccoStall;

import java.util.ArrayList;
import java.util.HashMap;

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

    public HashMap<String, Integer> getAllReviews(){
        HashMap<String,Integer> allReviews = new HashMap<>();
        for(int i = 0; i < allAttractionsAndStalls.size(); i++){
            allReviews.put(getAllReviewed().get(i).getName(), getAllReviewed().get(i).getRating());
        }
        return allReviews;
    }

//    public ArrayList<IReviewed> getAllAllowedFor(Visitor visitor){
//        ArrayList<IReviewed> listOfAllowed = new ArrayList<>();
//        for(int i = 0; i < allAttractionsAndStalls.size(); i++){
//            if (allAttractionsAndStalls.get(i).getClass() == RollerCoaster){
//            allAttractionsAndStalls.get(i).isAllowedTo(visitor);
//        }
//    }
}
