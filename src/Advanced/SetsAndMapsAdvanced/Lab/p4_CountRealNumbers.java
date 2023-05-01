package Advanced.SetsAndMapsAdvanced.Lab;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class p4_CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] input = readFromConsole(scanner);

        Map<Double, Integer> numbers = new LinkedHashMap<>();

        fillTheMap(input, numbers);

        printOutput(numbers);
    }

    private static void printOutput(Map<Double, Integer> numbers) {
        numbers.forEach((k, v) -> System.out.printf("%.1f -> %d\n", k, v));
    }

    private static void fillTheMap(double[] input, Map<Double, Integer> numbers) {
        for (double number : input) {
            if (numbers.containsKey(number)) {
                numbers.put(number, numbers.get(number) + 1);
            }
            numbers.putIfAbsent(number, 1);
        }
    }

    private static double[] readFromConsole(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split(" "))
                .mapToDouble(Double::parseDouble)
                .toArray();
    }
}
