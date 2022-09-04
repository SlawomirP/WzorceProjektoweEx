package chainOfResponsibilityExpl.officer;

import chainOfResponsibilityExpl.message.Message;

public class Sergeant extends Officer{

    //pole  z kodem obiektu tej klasy
    private static final int CODE = 10;
    private static final String NAME = "Srg Kowalski";
    @Override
    public void processMessage(Message message) {
        //sprawdzenie czy officerRank obiektu message jest rowna
        // SERGEANT oraz czy code jest równy temu w klasie
        if(message.getOfficerRank().equals(OfficerRank.SERGEANT) &&
        message.getCode() == CODE){
            System.out.println(NAME + " received message: " + message.getContent());
        }else{ // jezeli cos sie nie zgadza to nastepuje przekazanie message
            getSuperiorOfficer().processMessage(message);
        }
    }
}
