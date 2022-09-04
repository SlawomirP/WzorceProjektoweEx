package decoratorExpl;

public class Main{
    public static void main(String[] args) {
        generateMap();
    }
    private static void generateMap() {

        Terrain terrain = new Plain();
        Terrain terrain1 = new Hill();
        Terrain terrain2 = new SwampDecorator(new Hill());
        Terrain terrain3 = new SwampDecorator(new ForestDecorator(new Plain()));
        Terrain terrain4 = new RoadDecorator(new Hill());

        System.out.println(terrain2.getFuelCost());
        System.out.println(terrain3.getFuelCost());
        System.out.println(terrain4.getDescription() + terrain4.getFuelCost());
    }
}
