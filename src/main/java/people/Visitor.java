package people;

import behaviours.IReviewed;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Visitor {

    private int age;
    private double height;
    private double money;
    private ArrayList<IReviewed> visitedAttractions;

    public Visitor(int age, double height, double money) {
        this.age = age;
        this.height = height;
        this.money = money;
        this.visitedAttractions = new ArrayList<>();
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public double getMoney() {
        return money;
    }

    public int getNumberOfVisitedAttractions(){
        return this.visitedAttractions.size();
    }

    public ArrayList<IReviewed> getVisitedAttractions(){
        return this.visitedAttractions;
    }

    public void addVisitedAttraction(IReviewed attraction){
        this.visitedAttractions.add(attraction);
    }
}
