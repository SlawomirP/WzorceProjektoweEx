package proxyExpl;

public class SafeGameProxy implements SavedGame {

    private SavedGame sg; // tu bedzie savedGameFull docelowo
    private String name;

    @Override
    public void initialize() {
        this.name = "Save game - " + String.valueOf(System.currentTimeMillis());
    }

    @Override
    public void loadGame() {
        sg = new SavedGameFull();
        sg.initialize();
        sg.loadGame();
    }

    @Override
    public String getName() {
        return null;
    }
}
