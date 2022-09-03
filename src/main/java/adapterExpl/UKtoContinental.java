package adapterExpl;

public class UKtoContinental implements ContinentalDevice{
    //przerabiamy na interfejs continentalDevice
    //klasyczna implementacja ma pole z obiektem interfejsu przerabianego
    UKDevice device;
    //to pole musi zostac dostarczone w konstruktorze

    public UKtoContinental(UKDevice device) {
        this.device = device;
    }

    @Override
    public void On() {
        device.powerOn();

    }
}
