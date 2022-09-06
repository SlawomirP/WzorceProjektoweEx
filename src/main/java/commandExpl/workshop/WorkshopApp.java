package commandExpl.workshop;

public class WorkshopApp {

    private Robot robot;

    public WorkshopApp(Robot robot) {
        this.robot = robot;
    }

    //metoda dostepna z main
    public void run(){
        robot.turnOn();
        robot.cut();
        robot.drill();
        robot.turnOff();
    }
}
