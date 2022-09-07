package mementoExpl;

import mementoExpl.smartApp.Smart_App;

public class Main {
    public static void main(String[] args) {

        Smart_App smartApp = new Smart_App();

        smartApp.setVersion(1.0);

        System.out.println(smartApp);

        smartApp.getVersionList().add(9.1);

        System.out.println(smartApp);

        smartApp.setVersion(1.2);
        smartApp.setVersion(2.0);

        System.out.println(smartApp);
        smartApp.setVersion(smartApp.getVersionList().get(0));
        System.out.println(smartApp);
    }
}
