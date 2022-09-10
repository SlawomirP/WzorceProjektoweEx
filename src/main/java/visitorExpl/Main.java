package visitorExpl;

import visitorExpl.activity.Squash;
import visitorExpl.activity.Treadmill;
import visitorExpl.activity.Weights;
import visitorExpl.visitor.VisitorImpl;

public class Main {
    public static void main(String[] args) {
        Treadmill treadmill = new Treadmill(200);
        Squash squash = new Squash(45);
        Weights weights = new Weights(50,10);

        VisitorImpl visitorImpl = new VisitorImpl();

        treadmill.accept(visitorImpl);
        squash.accept(visitorImpl);
        weights.accept(visitorImpl);

    }
}
