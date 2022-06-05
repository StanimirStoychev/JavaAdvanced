package DefiningClasses.RawData;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Car> cars = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] info = scanner.nextLine().split("\\s+");
            String carModel = info[0];

            int engineSpeed = Integer.parseInt(info[1]);
            int enginePower = Integer.parseInt(info[2]);
            Engine engine = new Engine(engineSpeed, enginePower);

            int cargoWeight = Integer.parseInt(info[3]);
            String cargoType = info[4];
            Cargo cargo = new Cargo(cargoWeight, cargoType);

            List<Tire> tires = new ArrayList<>();
            for (int j = 5; j < info.length; j = j + 2) {
                double tirePressure = Double.parseDouble(info[j]);
                int tireAge = Integer.parseInt(info[j + 1]);
                Tire tire = new Tire(tirePressure, tireAge);
                tires.add(tire);
            }
            Car car = new Car(carModel, engine, cargo, tires);
            cars.add(car);
        }

        String cargoType = scanner.nextLine();
        switch (cargoType) {
            case "fragile":
                cars.stream()
                        .filter(car -> car.getCargo().getType().equals("fragile"))
                        .filter(car -> car.getTires().stream().anyMatch(tire -> tire.getPressure() < 1))
                        .forEach(car -> System.out.println(car.getModel()));
                break;
            case "flamable":
                cars.stream()
                        .filter(car -> car.getCargo().getType().equals("flamable"))
                        .filter(car -> car.getEngine().getPower() > 250)
                        .forEach(car -> System.out.println(car.getModel()));
                break;
        }
    }
}
