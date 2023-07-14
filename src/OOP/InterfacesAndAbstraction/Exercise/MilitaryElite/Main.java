package OOP.InterfacesAndAbstraction.Exercise.MilitaryElite;

import OOP.InterfacesAndAbstraction.Exercise.MilitaryElite.Private.PrivateImpl;
import OOP.InterfacesAndAbstraction.Exercise.MilitaryElite.lieutenantGeneral.LieutenantGeneral;
import OOP.InterfacesAndAbstraction.Exercise.MilitaryElite.lieutenantGeneral.LieutenantGeneralImpl;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<PrivateImpl> privates = new ArrayList<>();

        String input;

        while (!"End".equals(input = scanner.nextLine())) {
            String[] data = input.split("\\s+");

            String soldierType = data[0];
            int id = Integer.parseInt(data[1]);
            String firstName = data[2];
            String lastName = data[3];

            switch (soldierType) {
                case "Private":
                    var priv = new PrivateImpl(id, firstName, lastName, Double.parseDouble(data[4]));
                    System.out.println(priv);
                    privates.add(priv);
                    break;
                case "LieutenantGeneral":
                    LieutenantGeneral general = new LieutenantGeneralImpl(id, firstName, lastName,
                            Double.parseDouble(data[4]));
                    if (data.length > 5) {
                        for (int i = 5; i < data.length; i++) {
                            int currentPrivateId = Integer.parseInt(data[i]);
                            for (PrivateImpl soldier : privates) {
                                if (soldier.getId() == currentPrivateId) {
                                    general.addPrivate(soldier);
                                }
                            }
                        }
                    }
            }
        }
    }
}
