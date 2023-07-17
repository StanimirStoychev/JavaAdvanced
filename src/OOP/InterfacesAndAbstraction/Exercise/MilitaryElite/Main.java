package OOP.InterfacesAndAbstraction.Exercise.MilitaryElite;

import OOP.InterfacesAndAbstraction.Exercise.MilitaryElite.Private.PrivateImpl;
import OOP.InterfacesAndAbstraction.Exercise.MilitaryElite.commando.CommandoImpl;
import OOP.InterfacesAndAbstraction.Exercise.MilitaryElite.commando.Mission;
import OOP.InterfacesAndAbstraction.Exercise.MilitaryElite.engineer.EngineerImpl;
import OOP.InterfacesAndAbstraction.Exercise.MilitaryElite.engineer.Repair;
import OOP.InterfacesAndAbstraction.Exercise.MilitaryElite.enums.Corps;
import OOP.InterfacesAndAbstraction.Exercise.MilitaryElite.enums.State;
import OOP.InterfacesAndAbstraction.Exercise.MilitaryElite.lieutenantGeneral.LieutenantGeneralImpl;
import OOP.InterfacesAndAbstraction.Exercise.MilitaryElite.spy.SpyImpl;

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

                case "Private" -> {
                    var priv = new PrivateImpl(id, firstName, lastName, Double.parseDouble(data[4]));
                    System.out.println(priv);
                    privates.add(priv);
                }

                case "LieutenantGeneral" -> {
                    var general = new LieutenantGeneralImpl(id, firstName, lastName,
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
                    System.out.println(general);
                }

                case "Spy" -> {
                    var spy = new SpyImpl(id, firstName, lastName, data[4]);
                    System.out.println(spy);
                }

                case "Engineer" -> {
                    var engCorps = Corps.valueOf(data[5]);
                    var engineer = new EngineerImpl(id, firstName, lastName, Double.parseDouble(data[4]), engCorps);
                    if (data.length > 6) {
                        for (int i = 6; i < data.length; i += 2) {
                            String partName = data[i];
                            int hoursWorked = Integer.parseInt(data[i + 1]);
                            var repair = new Repair(partName, hoursWorked);
                            engineer.addRepair(repair);
                        }
                    }
                    System.out.println(engineer);
                }

                case "Commando" -> {
                    var comCorps = Corps.valueOf(data[5]);
                    var commando = new CommandoImpl(id, firstName, lastName, Double.parseDouble(data[4]), comCorps);
                    if (data.length > 6) {
                        for (int i = 6; i < data.length; i += 2) {
                            String codeName = data[i];
                            var state = State.valueOf(data[i + 1]);
                            var mission = new Mission(codeName, state);
                            commando.addMission(mission);
                        }
                    }
                    System.out.println(commando);
                }
            }
        }
    }
}
