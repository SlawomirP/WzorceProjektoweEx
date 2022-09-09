package strategyExpl;

import strategyExpl.chef.Chef;
import strategyExpl.chef.eggCooker.HardBoilEggCooker;
import strategyExpl.chef.eggCooker.SoftBoilEggCooker;

public class Main {
    public static void main(String[] args) {
        //new order - eggs

        Chef chef = new Chef("Gordon");
        chef.setEggCooker(new HardBoilEggCooker());
        chef.cook();

        chef.setEggCooker(new SoftBoilEggCooker());
        chef.cook();

        //new order - soft eggs
    }
}
