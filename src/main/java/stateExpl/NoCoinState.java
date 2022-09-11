package stateExpl;

public class NoCoinState implements State{
    @Override
    public void insertTheCoin(CoffeMachine coffeMachine) {
        System.out.println("wrzucono monete");
        //ustawienie nowego stanu pola state
        coffeMachine.state = new CoinInsertedState();
    }

    @Override
    public void pushTheButton(CoffeMachine coffeMachine) {
        System.out.println("wrzuc monete");
    }

    @Override
    public void takeTheCup(CoffeMachine coffeMachine) {
        System.out.println("wrzuc monete");
    }

    @Override
    public void returnTheCoin(CoffeMachine coffeMachine) {
        System.out.println("brak monety");
    }
}
