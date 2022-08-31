package builderExpl.houseClassic;

public class BigHouseBuilder implements HouseBuilder {

    private HouseClassic house;

    public BigHouseBuilder() {
        this.house = new HouseClassic();
    }

    @Override
    public void buildFloors() {
        this.house.setFloors("big floors");
    }

    @Override
    public void buildWalls() {
        this.house.setWalls("big walls");
    }

    @Override
    public void buildRoof() {
        this.house.setRoof("big roof");
    }

    @Override
    public void buildRooms() {
        this.house.setRooms("big rooms");
    }

    @Override
    public void buildWindows() {
        this.house.setWindows("big windows");
    }

    @Override
    public void buildDoors() {
        this.house.setDoors("big doors");
    }

    @Override
    public void buildGarage() {
        this.house.setGarage("big garage");
    }

    @Override
    public HouseClassic getHouse() {
        return house;
    }
}
