package commandExpl;

import commandExpl.command.CoffeMakerTurnOn;
import commandExpl.command.RobotCutCommand;
import commandExpl.command.RobotDrillCommand;
import commandExpl.command.RobotTurnOffCommand;
import commandExpl.command.RobotTurnOnCommand;
import commandExpl.workshop.CoffeMaker;
import commandExpl.workshop.Robot;
import commandExpl.workshop.WorkshopApp;

public class Main {
    public static void main(String[] args) {

        Robot robot = new Robot();
        CoffeMaker coffeMaker = new CoffeMaker();
        WorkshopApp workshopApp = new WorkshopApp();

//        workshopApp.addToQueue(new RobotTurnOnCommand(robot));
//        workshopApp.addToQueue(new RobotCutCommand(robot));
//        workshopApp.addToQueue(new RobotDrillCommand(robot));
//        workshopApp.addToQueue(new RobotTurnOffCommand(robot));
//        workshopApp.addToQueue(new CoffeMakerTurnOn(coffeMaker));
//
//        workshopApp.run();

        workshopApp.addToQueue(new RobotTurnOnCommand(robot));
        workshopApp.run();

        workshopApp.undoLastCommand();


    }
}
