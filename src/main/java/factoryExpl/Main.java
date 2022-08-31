package factoryExpl;

import factoryExpl.units.BlueFactory;
import factoryExpl.units.Factory;
import factoryExpl.units.InfantryUnit;
import factoryExpl.units.MechanizedUnit;
import factoryExpl.units.RedFactory;
import factoryExpl.units.UnitType;

public class Main {
    public static void main(String[] args) {

       //nie tworzymy nowego obiektu z konstruktora tylko z fabryki
        Factory bluefactory = new BlueFactory();
        Factory redFactory = new RedFactory();


//        teraz tworzymy obiekty przez instancje factoryUnita
        MechanizedUnit redTank = redFactory.createMechanizedUnit(UnitType.TANK);
        InfantryUnit redRifleman = redFactory.createInfantryUnit(UnitType.RIFLEMAN);

        MechanizedUnit blueTank = bluefactory.createMechanizedUnit(UnitType.TANK);
        InfantryUnit blueRifleman = bluefactory.createInfantryUnit(UnitType.RIFLEMAN);
    }
}
