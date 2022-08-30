package builderExpl.houseClassic;

public class HouseClassic {

    private String walls;
    private String floors;
    private String roof;
    private String rooms;
    private String windows;
    private String doors;
    private String garage;




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

    public void setWalls(String walls) {
        this.walls = walls;
    }

    public void setFloors(String floors) {
        this.floors = floors;
    }

    public void setRoof(String roof) {
        this.roof = roof;
    }

    public void setRooms(String rooms) {
        this.rooms = rooms;
    }

    public void setWindows(String windows) {
        this.windows = windows;
    }

    public void setDoors(String doors) {
        this.doors = doors;
    }

    public void setGarage(String garage) {
        this.garage = garage;
    }

    @Override
    public String toString() {
        return "House{" + "walls='" + walls + '\'' + ", floors='" + floors + '\'' + ", roof='" + roof + '\'' + ", windows='" + windows + '\'' + ", doors='" + doors + '\'' + ", garage='" + garage + '\'' + '}';
    }


}
