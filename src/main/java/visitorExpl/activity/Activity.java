package visitorExpl.activity;

import visitorExpl.visitor.Visitor;

public interface Activity {
    void accept(Visitor visitor);
}
