package OOP.InterfacesAndAbstraction.Exercise.MilitaryElite.specialisedSoldier;

import OOP.InterfacesAndAbstraction.Exercise.MilitaryElite.Private.PrivateImpl;
import OOP.InterfacesAndAbstraction.Exercise.MilitaryElite.enums.Corps;

public class SpecialisedSoldierImpl extends PrivateImpl implements SpecialisedSoldier {

    private final Corps corps;

    public SpecialisedSoldierImpl(int id, String firstName, String lastName, double salary, Corps corps) {
        super(id, firstName, lastName, salary);
        this.corps = corps;
    }

    public Corps getCorps() {
        return corps;
    }
}
