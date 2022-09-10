package visitorExpl.activity;

import visitorExpl.visitor.Visitor;

public class Treadmill implements Activity{

    private int distance;

    public Treadmill(int distance) {
        this.distance = distance;
    }

    public int getDistance() {
        return distance;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
