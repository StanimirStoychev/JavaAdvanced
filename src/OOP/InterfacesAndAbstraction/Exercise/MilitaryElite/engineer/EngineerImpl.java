package OOP.InterfacesAndAbstraction.Exercise.MilitaryElite.engineer;

import OOP.InterfacesAndAbstraction.Exercise.MilitaryElite.Private.PrivateImpl;
import OOP.InterfacesAndAbstraction.Exercise.MilitaryElite.enums.Corps;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class EngineerImpl extends PrivateImpl implements Engineer {

    Corps corps;
    private final Set<Repair> repairs;

    public EngineerImpl(int id, String firstName, String lastName, double salary, Corps corps) {
        super(id, firstName, lastName, salary);
        this.corps = corps;
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
        sb.append("Corps: ").append(corps);
        sb.append("%nRepairs:%n");
        repairs.forEach(sb::append);
        return sb.toString();
    }
}
