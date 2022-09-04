package templateMethodExpl;

public abstract class CarStartingSequence {

    //finalna metoda, aby nie zepsuć slgorytmu
    public final void startTheCar(){
        fastenSeatBelts();
        startTheIgnition();
        setTheGear();
        go();
    }

    //te dwie metody pozostaja niezmienne, -private-
    private void fastenSeatBelts() {
        System.out.println("Fasten seat belts");
    }
    private void go() {
        System.out.println("Start!");
    }

    public abstract void startTheIgnition();
    public abstract void setTheGear();
}
