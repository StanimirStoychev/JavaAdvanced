package OOP.InterfacesAndAbstraction.Exercise.MilitaryElite.lieutenantGeneral;

import OOP.InterfacesAndAbstraction.Exercise.MilitaryElite.Private.PrivateImpl;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class LieutenantGeneralImpl extends PrivateImpl implements LieutenantGeneral {

    private final Set<PrivateImpl> privates;

    public LieutenantGeneralImpl(int id, String firstName, String lastName, double salary) {
        super(id, firstName, lastName, salary);
        privates = new HashSet<>();
    }

    public void addPrivate(PrivateImpl priv) {
        privates.add(priv);
    }

    public Set<PrivateImpl> getPrivates() {
        return this.privates;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());

        sb.append("Privates:");

        privates.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(s -> sb.append(System.lineSeparator()).append(s));

        return sb.toString();
    }
}
