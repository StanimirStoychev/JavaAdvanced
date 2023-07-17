package OOP.InterfacesAndAbstraction.Exercise.MilitaryElite.engineer;

import OOP.InterfacesAndAbstraction.Exercise.MilitaryElite.Private.PrivateImpl;
import OOP.InterfacesAndAbstraction.Exercise.MilitaryElite.enums.Corps;
import OOP.InterfacesAndAbstraction.Exercise.MilitaryElite.specialisedSoldier.SpecialisedSoldierImpl;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class EngineerImpl extends SpecialisedSoldierImpl implements Engineer {

    private final Set<Repair> repairs;

    public EngineerImpl(int id, String firstName, String lastName, double salary, Corps corps) {
        super(id, firstName, lastName, salary, corps);
        repairs = new HashSet<>();
    }

    public void addRepair(Repair repair) {
        repairs.add(repair);
    }

    public Collection<Repair> getRepairs() {
        return repairs;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());

        sb.append(System.lineSeparator());
        sb.append("Corps: ").append(super.getCorps());
        sb.append(System.lineSeparator());
        sb.append("Repairs:");
        repairs.forEach(s -> sb.append(System.lineSeparator()).append("  ").append(s));

        return sb.toString();
    }
}
