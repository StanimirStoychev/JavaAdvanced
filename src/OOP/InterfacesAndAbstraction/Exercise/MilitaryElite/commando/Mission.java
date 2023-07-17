package OOP.InterfacesAndAbstraction.Exercise.MilitaryElite.commando;

import OOP.InterfacesAndAbstraction.Exercise.MilitaryElite.enums.State;

public class Mission {

    private final String codeName;
    private final State state;

    public Mission(String codeName, State state) {
        this.codeName = codeName;
        this.state = state;
    }

    public void completeMission() {

    }

    @Override
    public String toString() {
        return String.format("Code Name: %s State: %s", codeName, state);
    }
}
