package Advanced.FunctionalPrograming.Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.UnaryOperator;

public class p4_AddVAT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Double> prices = Arrays.stream(scanner.nextLine().split(", "))
                .map(Double::parseDouble)
                .toList();

        UnaryOperator<Double> addVAT = value -> value * 1.2;

        System.out.println("Prices with VAT:");
        prices.forEach(p -> System.out.printf("%.2f%n", addVAT.apply(p)));
    }
}
