package Advanced.FunctionalPrograming.Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class p1_SortEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(", "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        numbers.removeIf(n -> n % 2 != 0);

        printNumbers(numbers);

        System.out.println();

        numbers.sort(Integer::compareTo);

        printNumbers(numbers);


    }

    private static void printNumbers(List<Integer> numbers) {
        for (int i = 0; i < numbers.size(); i++) {
            if (i != numbers.size() - 1) {
                System.out.print(numbers.get(i) + ", ");
            } else {
                System.out.print(numbers.get(i));
            }
        }
    }
}
