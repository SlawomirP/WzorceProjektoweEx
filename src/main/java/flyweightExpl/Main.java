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
            activeObject.add(new TeslaTank(50, "TeslaTank", 100, 50, 25, 0, 0, 2));
            activeObject.add(new Rifleman(40, "Riflemnan man", 100, 50, 25, 0, 0, 3));
            activeObject.add(new Destroyer(505, "Destroyer big", 100, 50, 25, 0, 0, 3));
        }
    }
}
