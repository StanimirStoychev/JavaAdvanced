package Advanced.FunctionalPrograming.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindLastIndexOfTheSmallestElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                        .map(Integer::parseInt).collect(Collectors.toList());
        Function<List<Integer>, Integer> findMin = numList -> numList.stream().mapToInt(e -> e).min().getAsInt();
        int minElement = findMin.apply(numbers);
        System.out.println(numbers.lastIndexOf(minElement));
    }
}
