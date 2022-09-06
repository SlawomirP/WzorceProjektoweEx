package commandExpl.command;

import commandExpl.workshop.CoffeMaker;

public class CoffeMakerTurnOn implements Command{

    private CoffeMaker coffeMaker;

    public CoffeMakerTurnOn(CoffeMaker coffeMaker) {
        this.coffeMaker = coffeMaker;
    }

    @Override
    public void execute() {
        coffeMaker.turnOn();
    }

    @Override
    public void undo() {
        coffeMaker.turnOff();
    }
}
