package visitorExpl.visitor;

import visitorExpl.activity.Squash;
import visitorExpl.activity.Treadmill;
import visitorExpl.activity.Weights;

public interface Visitor {

    void visit(Treadmill treadmill);
    void visit(Squash squash);
    void visit(Weights weights);
}
