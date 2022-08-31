package factoryExpl.metodaFabrykujaca;

public class UnitFactory extends Factory {

    //to jest juz konkretna fabryka rozszerzajaca faktory
    @Override
    public Unit createUnit(UnitType unitType) {

        switch(unitType){
            case TANK:
                return new Tank(200,0,20);
            case RIFLEMAN:
                return new Rifleman(100,0,10);
            default:
                throw new UnsupportedOperationException("no such type");
        }
    }
}
