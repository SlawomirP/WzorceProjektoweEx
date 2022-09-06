package commandExpl;

import commandExpl.workshop.Robot;
import commandExpl.workshop.WorkshopApp;

public class Main {
    public static void main(String[] args) {

        WorkshopApp workshopApp = new WorkshopApp(new Robot());

        workshopApp.run();
    }
}
