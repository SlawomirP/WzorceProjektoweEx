package visitorExpl.activity;

import visitorExpl.visitor.Visitor;

public class Squash implements Activity {

    private int minutesPlayed;

    public Squash(int minutesPlayed) {
        this.minutesPlayed = minutesPlayed;
    }

    //obliczanie ilosci spalonych kalorii
//    public void calculateCaloriesBurned(){
//        System.out.println("Calories burned playing squash: " + minutesPlayed*20);
//    }

    public int getMinutesPlayed() {
        return minutesPlayed;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
