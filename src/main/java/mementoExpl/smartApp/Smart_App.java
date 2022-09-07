package mementoExpl.smartApp;

public class Smart_App {

    private Double version;

    public void changeVersion(Double version){
        this.version = version;
        System.out.println("New version: " + this.version);
    }

    //metody do zapisywania i odczytywania pamiatek, rowniez publiczne
    public SmartAppMemento save(){
        return new SmartAppMemento(this.version);
    }
    public void load(SmartAppMemento smartAppMemento){
        this.version = smartAppMemento.getVersion();
    }


}
