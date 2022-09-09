package strategyExpl.chef.eggCooker;

public class HardBoilEggCooker implements EggCooker{
    @Override
    public void cookEgg() {
        System.out.println("Hard eggs are cooking");
    }
}
