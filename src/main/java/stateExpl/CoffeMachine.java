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
                state = State.COIN_INSERTED;
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
        switch (state){
            case NO_COIN:
                System.out.println("Brak monety");
                break;
            case COIN_INSERTED:
                System.out.println("Nalewam kawę");
                state = State.CUP_FULL;
                break;
            case CUP_FULL:
                System.out.println("Zabierz najpierw kubek");
                break;
        }
    }

    public void takeTheCup(){
        switch (state){
            case NO_COIN:
                System.out.println("Brak monety");
                break;
            case COIN_INSERTED:
                System.out.println("Wcśnij guzik");
                break;
            case CUP_FULL:
                System.out.println("Zabrano kubek");
                state = State.NO_COIN;
                break;
        }
    }

    // dodatkowa opcja zwrot monety to dodatkowy switch
    public void zwrotMonety(){
        switch (state){
            case NO_COIN:
                System.out.println("Brak monety");
                break;
            case COIN_INSERTED:
                System.out.println("Zwracam monete");
                state = State.NO_COIN;
                break;
            case CUP_FULL:
                System.out.println("Nie mozna zwrocic monety");
                state = State.NO_COIN;
                break;
        }
    }


    public enum State{
        NO_COIN, COIN_INSERTED, CUP_FULL
    }
}
