package factoryExpl.units;

public class BlueFactory extends Factory{
    @Override
    public InfantryUnit createInfantryUnit(UnitType unitType) {
        switch (unitType){
            case RIFLEMAN:
                return new Rifleman(25,0,5);
            default:
                throw new UnsupportedOperationException("not type");
        }
    }

    @Override
    public MechanizedUnit createMechanizedUnit(UnitType unitType) {
        switch (unitType){
            case TANK:
                return new Tank(100,0,25);
            default:
                throw new UnsupportedOperationException("not type");
        }
    }
}
