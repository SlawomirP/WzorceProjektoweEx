package stateExpl;

public class CoinInsertedState implements State {
    @Override
    public void insertTheCoin(CoffeMachine coffeMachine) {
        System.out.println("moneta juz wrzucona");
    }

    @Override
    public void pushTheButton(CoffeMachine coffeMachine) {
        System.out.println("Nalewam");
        coffeMachine.state = new CupFullState();
    }

    @Override
    public void takeTheCup(CoffeMachine coffeMachine) {
        System.out.println("wcisniej guzik");
    }

    @Override
    public void returnTheCoin(CoffeMachine coffeMachine) {
        System.out.println("zwracam monete");
        coffeMachine.state = new NoCoinState();
    }
}
