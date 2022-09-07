package mementoExpl.smartApp;

class SmartAppMemento {

    //blizniacze pole ze smartApp
    private Double version;

    //usuniecie public zapobiega dostepowi klienta
    SmartAppMemento(Double version) {
        this.version = version;
    }

    Double getVersion() {
        return version;
    }
}
