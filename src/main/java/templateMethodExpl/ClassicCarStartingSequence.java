package templateMethodExpl;

public class ClassicCarStartingSequence extends CarStartingSequence{
    @Override
    public void startTheIgnition() {
        System.out.println("start ignition");
    }

    @Override
    public void setTheGear() {
        System.out.println("set gear");
    }
}
