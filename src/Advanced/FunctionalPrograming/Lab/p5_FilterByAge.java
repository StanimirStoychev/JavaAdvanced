package Advanced.FunctionalPrograming.Lab;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class p5_FilterByAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, Integer> people = new LinkedHashMap<>();

        fillTheCollectionWithPeople(scanner, people);

        String condition = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        String format = scanner.nextLine();

        printFilteredStudent(people, createTester(condition, age), createPrinter(format));
    }

    private static void fillTheCollectionWithPeople(Scanner scanner, Map<String, Integer> people) {
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] info = scanner.nextLine().split(", ");
            String name = info[0];
            int age = Integer.parseInt(info[1]);
            people.put(name, age);
        }
    }

    private static Consumer<Map.Entry<String, Integer>> createPrinter (String format) {
        return switch (format) {
            case "name age" -> person -> System.out.printf("%s - %d%n", person.getKey(), person.getValue());
            case "name" -> person -> System.out.println(person.getKey());
            case "age" -> person -> System.out.println(person.getValue());
            default -> null;
        };
    }

    private static Predicate<Integer> createTester(String condition, Integer age) {

        return switch (condition) {
            case "younger" -> x -> x <= age;
            case "older" -> x -> x >= age;
            default -> null;
        };
    }

    private static void printFilteredStudent(LinkedHashMap<String, Integer> people,
                                             Predicate<Integer> tester,
                                             Consumer<Map.Entry<String, Integer>> printer) {
        for (var person : people.entrySet()) {
            if (tester.test(people.get(person.getKey()))) {
                printer.accept(person);
            }
        }
    }
}
