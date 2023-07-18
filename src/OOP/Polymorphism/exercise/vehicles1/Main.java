package OOP.Polymorphism.exercise.vehicles1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] carInfo = scanner.nextLine().split(" ");
        String[] truckInfo = scanner.nextLine().split(" ");

        Vehicle car = new Car(Double.parseDouble(carInfo[1]), Double.parseDouble(carInfo[2]));
        Vehicle truck = new Truck(Double.parseDouble(truckInfo[1]), Double.parseDouble(truckInfo[2]));

        Map<String, Vehicle> vehicleMap = new HashMap<>();
        vehicleMap.put("Car", car);
        vehicleMap.put("Truck", truck);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split(" ");
            String command = tokens[0];
            String vehicleType = tokens[1];
            double quantity = Double.parseDouble(tokens[2]);

            Vehicle vehicle = vehicleMap.get(vehicleType);

            if ("Drive".equals(command)) {
                System.out.println(vehicle.drive(quantity).trim());
            } else if ("Refuel".equals(command)) {
                vehicle.refuel(quantity);
            }
        }

        car.printFuelQuantity();
        truck.printFuelQuantity();
    }
}
