package chainOfResponsibilityExpl.officer;

import chainOfResponsibilityExpl.message.Message;

public abstract class Officer {

    //pole z klasa w ktorej sie znajdujemy aktualnie
    //tu bedzie przypisywany ktos wyzej stanowiskiem
    private Officer superiorOfficer;

    public abstract void processMessage(Message message);

    public Officer getSuperiorOfficer() {
        return superiorOfficer;
    }

    public void setSuperiorOfficer(Officer superiorOfficer) {
        this.superiorOfficer = superiorOfficer;
    }
}
