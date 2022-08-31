package factoryExpl.units;

public abstract class MechanizedUnit {
    private int hp;
    private int exp;
    private int dmg;

    //zmiana na protected!!! zeby nikt nie utorzyl z konstruktora
    protected MechanizedUnit(int hp, int exp, int dmg) {
        this.hp = hp;
        this.exp = exp;
        this.dmg = dmg;
    }

    public int getHp() {
        return hp;
    }

    public int getExp() {
        return exp;
    }

    public int getDmg() {
        return dmg;
    }
}
