package builderExpl.main;

import builderExpl.house.House;

public class Main {
    public static void main(String[] args) {

//        House house1 = new House("walls", "floors", "rooms", "windows", "doors", "garage");

        House house = new House.HouseBuilder()
                .buildWalls("walls")
                .buildRooms("rooms")
                .buildGarage("garage")
                .build();

        System.out.println(house);

    }


}
