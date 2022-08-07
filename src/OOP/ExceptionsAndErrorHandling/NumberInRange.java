package OOP.ExceptionsAndErrorHandling;

import java.util.Arrays;
import java.util.Optional;
import java.util.Scanner;

public class NumberInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] range = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        int startIndex = range[0];
        int endIndex = range[1];

        System.out.printf("Range: [%d...%d]%n",startIndex, endIndex);

        boolean outOfRange = true;
        String input = null;

        while (outOfRange) {
            Optional<Integer> number = Optional.empty();
            input = scanner.nextLine();
            try {
                number = Optional.of(Integer.parseInt(input));
            } catch (NumberFormatException ignore) {
            }

            if (number.isEmpty() || number.get() < startIndex || number.get() > endIndex) {
                System.out.println("Invalid number: " + input);
            } else {
                outOfRange = false;
            }
        }

        System.out.println("Valid number: " + input);
    }
}
