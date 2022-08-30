package singletonExpl.singleton;

public enum GameEngineEnum {

    INSTANCE("gamer");

    private int hp = 100;
    private String charName = "gamer";

    private GameEngineEnum(String name){
        this.charName = name;
    }

    public void run() {
        while (true) {

            //input from gamer
            //changing game status
            //graphic rendering
        }
    }

}
