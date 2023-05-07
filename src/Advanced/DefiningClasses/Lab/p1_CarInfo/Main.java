package Advanced.DefiningClasses.Lab.p1_CarInfo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Car[] cars = new Car[n];

        fillTheCarList(scanner, n, cars);

        printCarInfo(cars);
    }

    private static void printCarInfo(Car[] cars) {
        for (Car car : cars) {
            System.out.println(car.carInfo());
        }
    }

    private static void fillTheCarList(Scanner scanner, int n, Car[] cars) {
        for (int i = 0; i < n; i++) {

            String[] input = scanner.nextLine().split(" ");
            String brand = input[0];
            String model = input[1];
            int horsePower = Integer.parseInt(input[2]);

            Car car = new Car();
            car.setBrand(brand);
            car.setModel(model);
            car.setHorsePower(horsePower);

            cars[i] = car;
        }
    }
}
