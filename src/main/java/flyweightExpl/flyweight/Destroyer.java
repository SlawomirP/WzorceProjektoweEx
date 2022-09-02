package flyweightExpl.flyweight;

public class Destroyer {

    private final Object resourceCost;
    private String name;
    private int hp;
    private int armour;
    private int damageDealt;
    private int speed;
    private int x;
    private int y;
    private int hpLeft;

    public Destroyer(Object resourceCost, String name, int hp, int armour, int damageDealt, int speed, int x, int y){
        this.resourceCost = resourceCost;
        this.name = name;
        this.hp = hp;
        this.armour = armour;
        this.damageDealt = damageDealt;
        this.speed = speed;
        this.x = x;
        this.y = y;
        this.hpLeft = hp;
    }
}
