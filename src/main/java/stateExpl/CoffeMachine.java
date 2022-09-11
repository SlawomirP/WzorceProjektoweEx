package stateExpl;

public class CoffeMachine {

    State state;

    public CoffeMachine(){
        this.state = State.NO_COIN;
    }

    public void insertTheCoin(){
        switch (state){
            case NO_COIN:
                System.out.println("Wrzucono monete");
                break;
            case COIN_INSERTED:
                System.out.println("Moneta juz wrzucona.");
                break;
            case CUP_FULL:
                System.out.println("Zabierz najpierw kubek");
                break;
        }
    }

    public void pushTheButton(){
        System.out.println("Wcisnieto przycisk");
    }

    public void takeTheCup(){
        System.out.println("Zabrano kubek");
    }

    public enum State{
        NO_COIN, COIN_INSERTED, CUP_FULL
    }
}
