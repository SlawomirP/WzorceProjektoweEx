package stateExpl;

public class CoffeMachine {

    State state;

    public CoffeMachine() {
        this.state = new NoCoinState();
    }

    public void insertTheCoin() {
        state.insertTheCoin(this);
    }

    public void pushTheButton() {
        state.pushTheButton(this);
    }

    public void takeTheCup() {
        state.takeTheCup(this);
    }

    // dodatkowa opcja zwrot monety to dodatkowy switch
    public void zwrotMonety() {
        state.returnTheCoin(this);
    }


}
