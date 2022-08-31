package factoryExpl;

import factoryExpl.metodaFabrykujaca.Factory;
import factoryExpl.metodaFabrykujaca.Tank;
import factoryExpl.metodaFabrykujaca.Unit;
import factoryExpl.metodaFabrykujaca.UnitFactory;
import factoryExpl.metodaFabrykujaca.UnitType;

public class Main {
    public static void main(String[] args) {

       //nie tworzymy nowego obiektu z konstruktora tylko z fabryki
        Factory factory = new UnitFactory();
//        teraz tworzymy obiekty przez instancje factoryUbita
        Unit tank = factory.createUnit(UnitType.TANK);
        Unit rifleman = factory.createUnit(UnitType.RIFLEMAN);

//        Unit tank = new Tank();
    }
}
