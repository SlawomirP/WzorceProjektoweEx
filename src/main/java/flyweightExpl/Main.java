package flyweightExpl;

import flyweightExpl.flyweight.Destroyer;
import flyweightExpl.flyweight.Rifleman;
import flyweightExpl.flyweight.TeslaTank;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Object> activeObject = new ArrayList<>();

        for (int i = 0; i<1000000; i++){
            activeObject.add(new TeslaTank(5,6));
            activeObject.add(new Rifleman(3,2));
            activeObject.add(new Destroyer(1,2));
        }
    }
}
