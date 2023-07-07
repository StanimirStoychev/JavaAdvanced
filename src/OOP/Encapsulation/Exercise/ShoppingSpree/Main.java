package OOP.Encapsulation.Exercise.ShoppingSpree;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] readPeople = scanner.nextLine().split(";");
        Map<String, Person> people = new LinkedHashMap<>();

        for (String readPerson : readPeople) {
            String[] currentPerson = readPerson.split("=");
            String name = currentPerson[0];
            double money = Double.parseDouble(currentPerson[1]);
            try {
                Person person = new Person(name, money);
                people.put(name, person);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                return;
            }
        }

        String[] readProducts = scanner.nextLine().split(";");
        Map<String, Product> products = new HashMap<>();

        for (String readProduct : readProducts) {
            String[] currentProduct = readProduct.split("=");
            String name = currentProduct[0];
            double cost = Double.parseDouble(currentProduct[1]);
            try {
                Product product = new Product(name, cost);
                products.put(name, product);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                return;
            }
        }

        String command;

        while (!"END".equals(command = scanner.nextLine())) {
            String[] info = command.split("\\s+");
            String personName = info[0];
            String productName = info[1];

            Person buyer = people.get(personName);
            Product productToBuy = products.get(productName);

            try {
                buyer.buyProduct(productToBuy);
                System.out.printf("%s bought %s%n", personName, productName);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        people.values().forEach(System.out::println);
    }
}