import Attraction.Attraction;
import Behaviors.IReviewed;
import Stall.Stall;
import Visitor.Visitor;

import java.util.ArrayList;

public class ThemePark {

    private ArrayList<Attraction> attractions;
    private ArrayList<Stall> stalls;
    private ArrayList<IReviewed> revieweds;

    public ThemePark(){
        this.attractions = new ArrayList<>();
        this.stalls = new ArrayList<>();
        this.revieweds = new ArrayList<>();
    }

    public int countAttractions() {
        return this.attractions.size();
    }

    public void addAttraction(Attraction attraction) {
        this.attractions.add(attraction);
    }

    public int countStalls() {
        return this.stalls.size();
    }

    public void addStall(Stall stall) {
        this.stalls.add(stall);
    }

    public void getAllReviewed(){
        for (IReviewed rating : this.attractions){
            revieweds.add(rating);
        }
        revieweds.addAll(this.stalls);
    }

    public int numberOfReviews() {
        return this.revieweds.size();
    }


    public String visit(Visitor visitor, Attraction attraction) {
        return visitor.getName() + " loves the " + attraction.getName();
    }
}
