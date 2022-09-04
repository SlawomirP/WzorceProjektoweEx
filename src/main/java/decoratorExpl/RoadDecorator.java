package decoratorExpl;

public class RoadDecorator extends TerrainDecorator{
    public RoadDecorator(Terrain terrain) {
        super(terrain);
    }
    @Override
    public int getFuelCost() {
        return terrain.getFuelCost() - 10;
    }
    @Override
    public String getDescription() {
        return terrain.getDescription() + ", there is a road";
    }
}
