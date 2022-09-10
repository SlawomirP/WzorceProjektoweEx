package visitorExpl.activity;

import visitorExpl.visitor.Visitor;

public class Weights implements Activity{

    private int weight;
    private int reps;

    public Weights(int weight, int reps) {
        this.weight = weight;
        this.reps = reps;
    }

    //obliczanie ilosci spalonych kalorii
//    public void calculateCaloriesBurned(){
//        System.out.println("Calories lifting weights: " + weight*reps*2 );
//    }


    public int getWeight() {
        return weight;
    }

    public int getReps() {
        return reps;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
