package Advanced.FunctionalPrograming.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ListOfPredicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Integer> numbsToDivide = Arrays.stream(scanner.nextLine().split(" "))
                        .map(Integer::parseInt).collect(Collectors.toList());

        Predicate<Integer> isDivisible = number -> {
            for (Integer numToDivide : numbsToDivide) {
                if (number % numToDivide != 0) {
                    return false;
                }
            }
            return true;
        };

        for (int i = 1; i <= n; i++) {
            if (isDivisible.test(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
