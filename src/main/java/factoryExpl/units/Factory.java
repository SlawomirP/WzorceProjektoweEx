package factoryExpl.units;

public abstract class Factory {
    //klasa ogolna z dwiema metodami abstrakcyjnymi
    public abstract InfantryUnit createInfantryUnit(UnitType unitType);
    public abstract MechanizedUnit createMechanizedUnit(UnitType unitType);
}
