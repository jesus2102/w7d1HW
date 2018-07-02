package Stall;

import Behaviors.ISecurity;
import Visitor.Visitor;

public class TobaccoStall extends Stall implements ISecurity{

    public TobaccoStall(String name, String ownerName, String parkingSpot, int rating){
        super(name, ownerName, parkingSpot, rating);
    }

    public boolean isAllowedTo(Visitor visitor){
        return visitor.getAge() >= 18;
    }
}
