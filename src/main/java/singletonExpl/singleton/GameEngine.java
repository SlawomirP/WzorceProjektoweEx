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
//
////    Problemy z wielowątkowością
////sposób nr 1 - to zrobienie metody getInstance całościowo synchroniczna
////    bedzie dzialal jeden wątek a reszta bedzie czekala
//public synchronized static GameEngine getInstance() {
//    if (instance == null) {
//        instance = new GameEngine();
//    }
//    return instance;
//}
//
////sposób drugi to podwojny check, ochrona tworzonego obiektu
////    cala reszta dziala bez synchronizacji -> ***
//public static GameEngine getInstance() {
//    if (instance == null) {
//        synchronized (GameEngine.class){
//            if (instance == null){
//                instance = new GameEngine();
//            }
//        }
//    }
//    return instance;
//}
//
////sposób trzeci można wykorzystać własność statica
////    i odrazu stworzyć obiekt
//
//    private static GameEngine instance = new GameEngine();
//
////    wtedy otrzymujemy tylko:
//
//    public synchronized static GameEngine getInstance() {
//        return instance;
//    }
//
////    Problem z serializacją - ktos go zserializuje a ktos inny zdeserializuje
//    //i zrobi dowolną ilość jego kopii
//
////    po pierwsze to musi implementować interfejs Serializable
//            public class GameEngine implements Serializable {
//
//            private static final long serialVersionUID =23232323;
//
//            //aby temu zapobiec, implementujemy metode
//
//    protected Object readResolve(){
//        return getInstance();
//    }
//}
//
////      Problem refleksji - ktos moze zrobic publiczny konstruktor
////    rozwiazaniem jest implementacja singletona jako enum (enum jest singletonem z def)







}
