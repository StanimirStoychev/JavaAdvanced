package OOP.InterfacesAndAbstraction.Exercise.MilitaryElite.commando;

import OOP.InterfacesAndAbstraction.Exercise.MilitaryElite.Private.Private;

import java.util.Collection;

public interface Commando extends Private {

    void addMission(Mission mission);

    Collection<Mission> getMissions();
}
