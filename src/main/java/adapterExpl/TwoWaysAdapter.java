package adapterExpl;
//dwa przypadki tak ze implementujemy oba interfejsy
public class TwoWaysAdapter implements UKDevice,ContinentalDevice{
//tworzymy pola z obiektami obu interfejsow
    UKDevice ukDevice;
    ContinentalDevice continentalDevice;
//w konstruktorze musza zostac rowniez zawarte oba parametry
    public TwoWaysAdapter(UKDevice ukDevice, ContinentalDevice continentalDevice) {
        this.ukDevice = ukDevice;
        this.continentalDevice = continentalDevice;
    }
//metody z interfejsow
    @Override
    public void On() {
        ukDevice.powerOn();
    }

    @Override
    public void powerOn() {
        continentalDevice.On();
    }
}
