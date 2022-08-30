package builderExpl.house;

public class House {

    private String walls;
    private String floors;
    private String roof;
    private String rooms;
    private String windows;
    private String doors;
    private String garage;

    //tworzymy prywatny konstruktor
    private House(HouseBuilder houseBuilder) {
        this.walls = houseBuilder.walls;
        this.floors = houseBuilder.floors;
        this.roof = houseBuilder.roof;
        this.windows = houseBuilder.windows;
        this.doors = houseBuilder.doors;
        this.garage = houseBuilder.garage;
        this.rooms = houseBuilder.rooms;
    }


    public String getWalls() {
        return walls;
    }

    public String getFloors() {
        return floors;
    }

    public String getRoof() {
        return roof;
    }

    public String getWindows() {
        return windows;
    }

    public String getDoors() {
        return doors;
    }

    public String getGarage() {
        return garage;
    }

    @Override
    public String toString() {
        return "House{" + "walls='" + walls + '\'' + ", floors='" + floors + '\'' + ", roof='" + roof + '\'' + ", windows='" + windows + '\'' + ", doors='" + doors + '\'' + ", garage='" + garage + '\'' + '}';
    }

    //tworzymy wewnetrzna klase statyczna
    public static class HouseBuilder {
        private String walls;
        private String floors;
        private String rooms;
        private String roof;
        private String windows;
        private String doors;
        private String garage;

        public House build() {
            return new House(this);
        }

        //teraz metody do ustawiania pól
        public HouseBuilder buildWalls(String walls) {
            this.walls = walls;
            return this;
        }

        public HouseBuilder buildFloors(String floors) {
            this.floors = floors;
            return this;
        }

        public HouseBuilder buildRooms(String rooms) {
            this.rooms = rooms;
            return this;
        }

        public HouseBuilder buildRoof(String roof) {
            this.roof = roof;
            return this;
        }

        public HouseBuilder buildWindows(String windows) {
            this.windows = windows;
            return this;
        }

        public HouseBuilder buildDoors(String doors) {
            this.doors = doors;
            return this;
        }

        public HouseBuilder buildGarage(String garage) {
            this.garage = garage;
            return this;
        }

    }
}
