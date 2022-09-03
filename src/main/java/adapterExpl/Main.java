package adapterExpl;

public class Main {
    public static void main(String[] args) {
        ContinentalDevice continentalRadio = new ContinentalDevice() {
            @Override
            public void On() {
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
        System.out.println("++++++++++++++++++++++++++++");

        UKtoContinental ukRadioToContinental = new UKtoContinental(ukRadio);
        continentalSocket.plugIn(ukRadioToContinental); // i tu zrobimy adapter

//        twoways adapter
        System.out.println("---------------------------------");

        TwoWaysAdapter twoWaysAdapter = new TwoWaysAdapter(ukRadio, continentalRadio);

        continentalSocket.plugIn(twoWaysAdapter);
        ukSocket.plugIn(twoWaysAdapter);

    }
}
