package chainOfResponsibilityExpl.officer;

import chainOfResponsibilityExpl.message.Message;

public class General extends Officer{
    private static final int CODE = 100;
    private static final String NAME = "Gnr Smith";
    @Override
    public void processMessage(Message message) {
        if(message.getOfficerRank().equals(OfficerRank.GENERAL) &&
        message.getCode() == CODE){
            System.out.println(NAME + " received message: " + message.getContent());
        }else{
//            getSuperiorOfficer().processMessage(message); general nie ma nikogo wyzej
            System.out.println("Wrong addresse !");
        }
    }
}
