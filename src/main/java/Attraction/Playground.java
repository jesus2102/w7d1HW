package Attraction;

import Behaviors.ISecurity;
import Visitor.Visitor;

public class Playground extends Attraction implements ISecurity {

    public Playground(String name) {
        super(name);
    }

    public boolean isAllowedTo(Visitor visitor){
        return visitor.getAge() <= 15;
    }
}
