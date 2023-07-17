package OOP.InterfacesAndAbstraction.Exercise.MilitaryElite.spy;

import OOP.InterfacesAndAbstraction.Exercise.MilitaryElite.soldier.SoldierImpl;

public class SpyImpl extends SoldierImpl implements Spy {

    private final String codeNumber;

    public SpyImpl(int id, String firstName, String lastName, String codeNumber) {
        super(id, firstName, lastName);
        this.codeNumber = codeNumber;
    }

    public String getCodeNumber() {
        return codeNumber;
    }

    @Override
    public String toString() {
        return String.format("Name: %s %s Id: %d%n" +
                "Code Number: %s", getFirstName(), getLastName(), getId(), getCodeNumber());
    }
}
