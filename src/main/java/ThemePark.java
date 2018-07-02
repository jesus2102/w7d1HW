import Attraction.Attraction;
import Stall.Stall;

import java.util.ArrayList;

public class ThemePark {

    private ArrayList<Attraction> attractions;
    private ArrayList<Stall> stalls;

    public ThemePark(){
        this.attractions = new ArrayList<>();
        this.stalls = new ArrayList<>();
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
}
