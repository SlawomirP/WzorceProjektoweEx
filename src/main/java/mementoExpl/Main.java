package mementoExpl;

import mementoExpl.smartApp.SmartAppCaretaker;
import mementoExpl.smartApp.Smart_App;

public class Main {
    public static void main(String[] args) {

        //utworzenie obiektu zarzadzajacego
        SmartAppCaretaker smartAppCaretaker = new SmartAppCaretaker();

        // glowny obiekt
        Smart_App smartApp = new Smart_App();
        smartApp.changeVersion(1.0);
        smartApp.changeVersion(1.1);
        smartApp.changeVersion(1.2);

        //aby zapisac ostatnia wersje korzystamy z caretakera
        smartAppCaretaker.addMemento(smartApp.save());

        smartApp.changeVersion(1.3);
        smartApp.changeVersion(2.0);
        smartApp.changeVersion(2.1);

        //wczytanie poprzedniej wersji
        smartApp.load(smartAppCaretaker.getMemento(0));

        //ze smartapp tylko zmiana wersji zapis i odczyt przez inna klase

    }
}
