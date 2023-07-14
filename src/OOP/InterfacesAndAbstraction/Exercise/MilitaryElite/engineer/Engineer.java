package OOP.InterfacesAndAbstraction.Exercise.MilitaryElite.engineer;

import OOP.InterfacesAndAbstraction.Exercise.MilitaryElite.Private.Private;

import java.util.Collection;

public interface Engineer extends Private {

    void addRepair(Repair repair);

    Collection<Repair> getRepairs();
}
