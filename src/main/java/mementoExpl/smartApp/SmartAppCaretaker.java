package mementoExpl.smartApp;

import java.util.ArrayList;
import java.util.List;

public class SmartAppCaretaker {
    //zarzadzanie pamiatkami

    private List<SmartAppMemento> mementos = new ArrayList<>();

    public void addMemento(SmartAppMemento smartAppMemento){
        mementos.add(smartAppMemento);
        System.out.println("Added version: " + smartAppMemento.getVersion() + ", index -> " + (mementos.size() - 1) );
    }

    public SmartAppMemento getMemento(int index){
        System.out.println("Version loaded: " + mementos.get(index).getVersion());
        return mementos.get(index);
    }
}
