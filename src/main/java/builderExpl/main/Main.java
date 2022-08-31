package builderExpl.main;

import builderExpl.house.House;
import builderExpl.houseClassic.BigHouseBuilder;
import builderExpl.houseClassic.HouseClassic;
import builderExpl.houseClassic.HouseDirector;
import builderExpl.houseClassic.SmallHouseBuilder;

public class Main {
    public static void main(String[] args) {

        House house = new House.HouseBuilder()
                .buildWalls("walls")
                .buildRooms("rooms")
                .buildGarage("garage")
                .build();

        System.out.println(house);

        //utworzenie instancji builderów
        SmallHouseBuilder smallHouseBuilder = new SmallHouseBuilder();
        BigHouseBuilder bigHouseBuilder = new BigHouseBuilder();

        //utworzenie instancji klasy zarzadzajacej builderami
        HouseDirector smallHouseDirector = new HouseDirector(smallHouseBuilder);
        HouseDirector bigHouseDirector = new HouseDirector(bigHouseBuilder);

        //wywolanie metod build na odpowiednich instancjach HouseDirector
        smallHouseDirector.buildHouse();
        bigHouseDirector.buildHouse();

        //tworzenie juz obiektów HouseClassic i przypisanie do nich obiektwo
        //director
        HouseClassic smallHouse = smallHouseDirector.getHouse();
        HouseClassic bigHouse = bigHouseDirector.getHouse();

        //wyswietlenie housow
        System.out.println(smallHouse);
        System.out.println(bigHouse);



    }


}
