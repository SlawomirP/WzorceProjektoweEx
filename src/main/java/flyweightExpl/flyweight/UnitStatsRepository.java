package flyweightExpl.flyweight;

public class UnitStatsRepository {

    //TO JEST POMOCNICZY GOTOWIE, MAMY TU STATIC OBIEKT KAZDEJ KLASY PLUS METODE ZWRACAJACA STATY, PRIV KONSTRUKTOR
    private static UnitStats destroyerStats= new UnitStats("Destroyer Big", 500, 100, 50, 15, 200);
    private static UnitStats riflemanUnitStats = new UnitStats("Rifleman Eddie", 100,50,10,3,15);
    private static UnitStats testaTankUnitStats = new UnitStats("Tesla Flak", 350, 250, 80, 7,300);


    //prywatny konstruktor aby nikt nie wywolywal gdzies tego obiektu

    private UnitStatsRepository() {
    }
    public static UnitStats getDestroyerStats(){
        return destroyerStats;
    }
    public static UnitStats getRiflemanUnitStats(){return riflemanUnitStats;}

    public static UnitStats getTestaTankUnitStats(){return testaTankUnitStats;}
}
