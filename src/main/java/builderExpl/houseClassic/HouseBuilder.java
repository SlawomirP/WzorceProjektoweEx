package builderExpl.houseClassic;

import builderExpl.house.House;

public interface HouseBuilder {

    void buildFloors();
    void buildWalls();
    void buildRoof();
    void buildRooms();
    void buildWindows();
    void buildDoors();
    void buildGarage();

//    metoda zwracajaca obiekt
    HouseClassic getHouse();
}

