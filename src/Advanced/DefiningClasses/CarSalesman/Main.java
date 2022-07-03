package Advanced.DefiningClasses.CarSalesman;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countEngines = Integer.parseInt(scanner.nextLine());
        Map<String, Engine> engines = new HashMap<>();

        for (int i = 0; i < countEngines; i++) {
            String[] engineInfo = scanner.nextLine().split(" ");
            String engineModel = engineInfo[0];
            int enginePower = Integer.parseInt(engineInfo[1]);
            String engineDisplacement = "n/a";
            String engineEfficiency = "n/a";
            switch (engineInfo.length) {
                case 3:
                    if (engineInfo[2].matches("\\d+")) {
                        engineDisplacement = engineInfo[2];
                    } else {
                        engineEfficiency = engineInfo[2];
                    }
                    break;
                case 4:
                    engineDisplacement = engineInfo[2];
                    engineEfficiency = engineInfo[3];
                    break;
            }
            Engine engine = new Engine(engineModel, enginePower, engineDisplacement, engineEfficiency);
            engines.put(engineModel, engine);
        }
        int countCars = Integer.parseInt(scanner.nextLine());
        LinkedList<Car> cars = new LinkedList<>();

        for (int i = 0; i < countCars; i++) {
            String[] carInfo = scanner.nextLine().split("\\s+");
            String carModel = carInfo[0];
            Engine engine = engines.get(carInfo[1]);
            String carWeight = "n/a";
            String carColor = "n/a";
            switch (carInfo.length) {
                case 3:
                    if (carInfo[2].matches("\\d+")) {
                        carWeight = carInfo[2];
                    } else {
                        carColor = carInfo[2];
                    }
                    break;
                case 4:
                    carWeight = carInfo[2];
                    carColor = carInfo[3];
                    break;
            }
            Car car = new Car(carModel, engine, carWeight, carColor);
            cars.add(car);
        }
        cars.forEach(System.out::print);
    }
}
