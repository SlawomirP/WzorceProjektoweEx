package singletonExpl.singleton;

public class GameEngine {

    private int hp = 100;
    private String charName = "gracz";

    //tworzymy pole priv klasy o nazwie instance -> 2
    private static GameEngine instance;

    //tworzymy priv konstruktor dla klasy GameEngine -> 1
    private GameEngine() {

    }

    public void run() {
        while (true) {

            //input from gamer
            //changing game status
            //graphic rendering
        }
    }

    //metoda publiczna zwracajaca nam instancje klasy -> 3
    public static GameEngine getInstance() {
        if (instance == null) {
            instance = new GameEngine();
        }
        return instance;
    }
}
