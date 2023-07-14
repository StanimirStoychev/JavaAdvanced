package OOP.InterfacesAndAbstraction.Exercise.MilitaryElite.specialisedSoldier;

import OOP.InterfacesAndAbstraction.Exercise.MilitaryElite.enums.Corps;

public class SpecialisedSoldierImpl implements SpecialisedSoldier {

    private final Corps corp;

    public SpecialisedSoldierImpl(Corps corp) {
        this.corp = corp;
    }

    public Corps getCorp() {
        return corp;
    }
}
