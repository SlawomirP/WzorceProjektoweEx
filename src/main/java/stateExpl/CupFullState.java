package stateExpl;

public class CupFullState implements State{
    @Override
    public void insertTheCoin(CoffeMachine coffeMachine) {
        System.out.println("zabierz kubek");
    }

    @Override
    public void pushTheButton(CoffeMachine coffeMachine) {
        System.out.println("zabierz kubek");
    }

    @Override
    public void takeTheCup(CoffeMachine coffeMachine) {
        System.out.println("kubek zabrany");
        coffeMachine.state = new NoCoinState();
    }

    @Override
    public void returnTheCoin(CoffeMachine coffeMachine) {
        System.out.println("za pozno");
    }
}
