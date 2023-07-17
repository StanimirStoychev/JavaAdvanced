package OOP.InterfacesAndAbstraction.Exercise.MilitaryElite.lieutenantGeneral;

import OOP.InterfacesAndAbstraction.Exercise.MilitaryElite.Private.Private;
import OOP.InterfacesAndAbstraction.Exercise.MilitaryElite.Private.PrivateImpl;

import java.util.Set;

public interface LieutenantGeneral extends Private {

    void addPrivate(PrivateImpl priv);

    Set<PrivateImpl> getPrivates();
}
