package decoratorExpl;

public class Plain extends Terrain{
    //dajemy tu na sztywno zeby user nie ustawial wlasnych parametrow
    public Plain() {
        super("plain", 13);
    }
}
