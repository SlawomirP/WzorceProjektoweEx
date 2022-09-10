package visitorExpl.visitor;

import visitorExpl.activity.Squash;
import visitorExpl.activity.Treadmill;
import visitorExpl.activity.Weights;

public class VisitorImpl implements Visitor{
    @Override
    public void visit(Treadmill treadmill) {
        System.out.println("Calories burned running on treadmill: " + treadmill.getDistance()*3);
    }

    @Override
    public void visit(Squash squash) {
        System.out.println("Calories burned playing squash: " + squash.getMinutesPlayed()*20);
    }

    @Override
    public void visit(Weights weights) {
        System.out.println("Calories lifting weights: " + weights.getWeight()*weights.getReps()*2 );
    }
}
