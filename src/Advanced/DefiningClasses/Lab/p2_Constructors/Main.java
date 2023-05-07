package Advanced.DefiningClasses.Lab.p2_Constructors;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Car2[] cars = new Car2[n];

        fillTheCarsList(scanner, n, cars);

        for (Car2 car : cars) {
            System.out.println(car.carInfo());
        }
    }

    private static void fillTheCarsList(Scanner scanner, int n, Car2[] cars) {
        for (int i = 0; i < n; i++) {

            String[] input = scanner.nextLine().split(" ");
            String brand = input[0];
            Car2 car;
            if (input.length == 3) {
                String model = input[1];
                int horsePower = Integer.parseInt(input[2]);
                car = new Car2(brand, model, horsePower);
            } else {
                car = new Car2(brand);
            }

            cars[i] = car;
        }
    }
}
