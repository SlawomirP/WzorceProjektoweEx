package chainOfResponsibilityExpl;

import chainOfResponsibilityExpl.message.Message;
import chainOfResponsibilityExpl.officer.Captain;
import chainOfResponsibilityExpl.officer.General;
import chainOfResponsibilityExpl.officer.Officer;
import chainOfResponsibilityExpl.officer.OfficerRank;
import chainOfResponsibilityExpl.officer.Sergeant;

public class Main {
    public static void main(String[] args) {

        //utworzenie wiadomości
        Message message1 = new Message("Attack!",50, OfficerRank.CAPTAIN);
        Message message2 = new Message("Attack!",20, OfficerRank.CAPTAIN);

        //utworzenie instancji wszystkich oficerów
        Officer sergeant = new Sergeant();
        Officer captain = new Captain();
        Officer general = new General();

        //ustawienie łańcucha odpowiedzialności, kto nad kim, jezeli warunki
        //z wiadomosci nie zostana spelnione idzie ona wyzej
        sergeant.setSuperiorOfficer(captain);
        captain.setSuperiorOfficer(general);

        sergeant.processMessage(message1);




    }
}
