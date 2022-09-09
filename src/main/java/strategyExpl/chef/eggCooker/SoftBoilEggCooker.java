package strategyExpl.chef.eggCooker;

public class SoftBoilEggCooker implements EggCooker{
    @Override
    public void cookEgg() {
        System.out.println("Soft eggs are cooking");
    }
}
