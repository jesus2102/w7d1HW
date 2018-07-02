package Attraction;

import Behaviors.ISecurity;
import Visitor.Visitor;

public class RollerCoaster extends Attraction implements ISecurity{

    public RollerCoaster(String name, int rating){
        super(name, rating);
    }

    @Override
    public boolean isAllowedTo(Visitor visitor) {
        if (visitor.getAge() < 12 || visitor.getHeight() < 1.45) {
            return false;
        }
        else {
            return true;
        }
    }
}
