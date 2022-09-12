package facadePattern;

import facadePattern.deliveryBox.DeliveryBoxFacade;

public class Main {
    public static void main(String[] args) {

        DeliveryBoxFacade deliveryBoxFacade = new DeliveryBoxFacade();
        deliveryBoxFacade.pickupPackage();

    }
}
