package OOP.InterfacesAndAbstraction.Exercise.MilitaryElite.lieutenantGeneral;

import OOP.InterfacesAndAbstraction.Exercise.MilitaryElite.Private.Private;
import OOP.InterfacesAndAbstraction.Exercise.MilitaryElite.Private.PrivateImpl;
import OOP.InterfacesAndAbstraction.Exercise.MilitaryElite.soldier.Soldier;

import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class LieutenantGeneralImpl extends PrivateImpl implements LieutenantGeneral {

    private final Set<Private> privates;

    public LieutenantGeneralImpl(int id, String firstName, String lastName, double salary) {
        super(id, firstName, lastName, salary);
        privates = new HashSet<>();
    }

    public void addPrivate(PrivateImpl priv) {
        privates.add(priv);
    }

    public Collection<Private> getPrivates() {
        return privates;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        sb.append("Privates:%n");
        privates.stream()
                .map(Soldier::getId)
                .sorted(Comparator.reverseOrder())
                .forEach(sb::append);
        return sb.toString();
    }
}
