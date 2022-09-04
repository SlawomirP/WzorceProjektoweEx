package chainOfResponsibilityExpl.message;

import chainOfResponsibilityExpl.officer.OfficerRank;

public class Message {
    private String content;
    private int code;
    private OfficerRank officerRank;
//konstruktor zapewnia ze wiadomosc trafi do odpowiedniego oficera z
    //odpowiednim kodem
    public Message(String content, int code, OfficerRank officerRank) {
        this.content = content;
        this.code = code;
        this.officerRank = officerRank;
    }

    public int getCode() {
        return code;
    }

    public OfficerRank getOfficerRank() {
        return officerRank;
    }

    public String getContent() {
        return content;
    }
}
