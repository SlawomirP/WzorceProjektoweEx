package flyweightExpl.flyweight;

public class Destroyer {
    //TO JEST KLASA DESTROYERA TYLKO ZE ZMIENNYMI POLAMI
    //STALE SA ZAWARTE W OBIEKCIE
    private int x;
    private int y;
    private int hpLeft;
    private UnitStats stats; // tu stale staty
    public Destroyer(int x, int y) {
        //pole ze stałymi statystykami
        stats = UnitStatsRepository.getDestroyerStats();
        this.x = x;
        this.y = y;
        //ze stats wyciagamy hp
        this.hpLeft = stats.getHp();
    }
}
