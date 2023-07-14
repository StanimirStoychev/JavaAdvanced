package OOP.InterfacesAndAbstraction.Exercise.MilitaryElite.lieutenantGeneral;

import OOP.InterfacesAndAbstraction.Exercise.MilitaryElite.Private.Private;
import OOP.InterfacesAndAbstraction.Exercise.MilitaryElite.Private.PrivateImpl;

import java.util.Collection;

public interface LieutenantGeneral extends Private {

    void addPrivate(PrivateImpl priv);

    Collection<Private> getPrivates();
}
