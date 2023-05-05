package Advanced.FunctionalPrograming.Lab;

import java.util.Scanner;
import java.util.function.Function;


public class p2_SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(", ");

        if (input.length < 2) {
            printCount(input);
            System.out.println("Sum = " + input[0]);
        } else {
            Function<String, Integer> parser = Integer::parseInt;
            int sum = 0;
            for (String s : input) {
                sum += parser.apply(s);
            }
            printCount(input);
            System.out.println("Sum = " + sum);
        }
    }

    private static void printCount(String[] input) {
        System.out.println("Count = " + input.length);
    }
}
