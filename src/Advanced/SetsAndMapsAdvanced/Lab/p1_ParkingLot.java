package Advanced.SetsAndMapsAdvanced.Lab;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class p1_ParkingLot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<String> plateNumbers = new LinkedHashSet<>();

        parkingWork(scanner, plateNumbers);

        printOutput(plateNumbers);
    }

    private static void printOutput(Set<String> plateNumbers) {
        if (plateNumbers.isEmpty()) {
            System.out.println("Parking Lot is Empty");
        } else {
            plateNumbers.forEach(System.out::println);
        }
    }

    private static void parkingWork(Scanner scanner, Set<String> plateNumbers) {

        String input;

        while (!"END".equals(input = scanner.nextLine())) {
            String[] data = input.split(", ");
            String direction = data[0];
            String plateNumber = data[1];

            switch (direction) {
                case "IN" -> plateNumbers.add(plateNumber);
                case "OUT" -> plateNumbers.remove(plateNumber);
            }
        }
    }
}