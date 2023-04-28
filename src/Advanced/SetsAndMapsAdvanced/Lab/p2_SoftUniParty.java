package Advanced.SetsAndMapsAdvanced.Lab;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class p2_SoftUniParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<String> regulars = new TreeSet<>();
        Set<String> VIPs = new TreeSet<>();

        fillTheGuestList(scanner, regulars, VIPs);

        removeTheGuestsWhoHaveComeFromList(scanner, regulars, VIPs);

        printGuestsWhoDidntCome(regulars, VIPs);
    }

    private static void printGuestsWhoDidntCome(Set<String> regulars, Set<String> VIPs) {
        int guestsCount = VIPs.size() + regulars.size();
        System.out.println(guestsCount);

        if (!VIPs.isEmpty()) {
            VIPs.forEach(System.out::println);
        }
        if (!regulars.isEmpty()) {
            regulars.forEach(System.out::println);
        }
    }

    private static void removeTheGuestsWhoHaveComeFromList(Scanner scanner, Set<String> regulars, Set<String> VIPs) {
        String currentGuest;
        while (!"END".equals(currentGuest = scanner.nextLine())) {
            regulars.remove(currentGuest);
            VIPs.remove(currentGuest);
        }
    }

    private static void fillTheGuestList(Scanner scanner, Set<String> regulars, Set<String> VIPs) {
        String currentGuest;
        while (!"PARTY".equals(currentGuest = scanner.nextLine())) {
            if (currentGuest.length() == 8) {
                if (currentGuest.charAt(0) >= 48 && currentGuest.charAt(0) <= 57) {
                    VIPs.add(currentGuest);
                } else {
                    regulars.add(currentGuest);
                }
            }
        }
    }
}
