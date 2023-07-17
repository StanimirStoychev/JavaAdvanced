package OOP.InterfacesAndAbstraction.Exercise.MilitaryElite.commando;

import OOP.InterfacesAndAbstraction.Exercise.MilitaryElite.enums.Corps;
import OOP.InterfacesAndAbstraction.Exercise.MilitaryElite.specialisedSoldier.SpecialisedSoldierImpl;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class CommandoImpl extends SpecialisedSoldierImpl implements Commando {
    private final Set<Mission> missions;

    public CommandoImpl(int id, String firstName, String lastName, double salary, Corps corps) {
        super(id, firstName, lastName, salary, corps);
        missions = new HashSet<>();
    }

    public void addMission(Mission mission) {
        missions.add(mission);
    }

    public Collection<Mission> getMissions() {
        return missions;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder(super.toString());

        sb.append(System.lineSeparator());
        sb.append("Corps: ").append(super.getCorps());
        sb.append(System.lineSeparator());
        sb.append("Repairs:");
        missions.forEach(s -> sb.append(System.lineSeparator()).append("  ").append(s));

        return sb.toString();
    }
}
