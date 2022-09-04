package decoratorExpl;

public abstract class TerrainDecorator extends Terrain{

    //pole protected z Terrain
    protected Terrain terrain;

    //w dekoratorze dajemy pusty konstruktor z parametrem Terrain
    public TerrainDecorator(Terrain terrain) {
        super("",0);
        this.terrain = terrain;
    }
}
