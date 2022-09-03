package adapterExpl;

public class Main {
    public static void main(String[] args) {

        ContinentalDevice continentalRadio = new ContinentalDevice() {
            @Override
            public void powerOn() {
                System.out.println("Music from continental radio");
            }
        };
        UKDevice ukRadio = new UKDevice() {
            @Override
            public void powerOn() {
                System.out.println("Music from UK radio");
            }
        };

        ContinentalSocket continentalSocket = new ContinentalSocket();
        UKSocket ukSocket = new UKSocket();

        continentalSocket.plugIn(continentalRadio);
        ukSocket.plugIn(ukRadio);

        continentalSocket.plugIn(ukRadio); // i tu zrobimy adapter
        ukSocket.plugIn(continentalRadio);
    }
}
