package commandExpl.command;

import commandExpl.workshop.CoffeMaker;

public class CoffeMakerTurnOff implements Command{

    private CoffeMaker coffeMaker;

    public CoffeMakerTurnOff(CoffeMaker coffeMaker) {
        this.coffeMaker = coffeMaker;
    }

    @Override
    public void execute() {
        coffeMaker.turnOff();
    }

    @Override
    public void undo() {
        coffeMaker.turnOn();
    }
}
