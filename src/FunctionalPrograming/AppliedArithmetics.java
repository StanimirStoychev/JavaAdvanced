package FunctionalPrograming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class AppliedArithmetics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        UnaryOperator<List<Integer>> addF = nums -> nums.stream().map(num -> ++num).collect(Collectors.toList());
        UnaryOperator<List<Integer>> subtractF = nums -> nums.stream().map(num -> --num).collect(Collectors.toList());
        UnaryOperator<List<Integer>> multiplyF = nums -> nums.stream().map(num -> num * 2).collect(Collectors.toList());
        Consumer<Integer> printer = e -> System.out.printf("%d ", e);

        String command = scanner.nextLine();

        while (!command.equals("end")) {
            switch (command) {
                case "add":
                    numbers = addF.apply(numbers);
                    break;
                case "multiply":
                    numbers = multiplyF.apply(numbers);
                    break;
                case "subtract":
                    numbers = subtractF.apply(numbers);
                    break;
                case "print":
                    numbers.stream().forEach(printer);
                    System.out.println();
            }

            command = scanner.nextLine();
        }
        System.out.println();
    }
}
