package facadePattern.deliveryBox;

class DeliveryBoxSystem {

    void sendNotofication() {
        System.out.println("Text message sent to the client");
    }

    boolean isPaymentSecured() {
        System.out.println("Payement has been secured");
        return true;
    }

    boolean isUserDataValidated() {
        System.out.println("User data has been validated");
        return true;
    }

    void sheduleDelivery() {
        System.out.println("Delivery has been scheduled.");
    }
}
