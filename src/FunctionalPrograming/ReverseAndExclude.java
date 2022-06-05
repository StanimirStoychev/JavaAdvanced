package FunctionalPrograming;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class ReverseAndExclude {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .boxed()
                .collect(Collectors.toList());
        int n = Integer.parseInt(scanner.nextLine());

        numbers.removeIf(e -> e % n == 0);
        Collections.reverse(numbers);
        numbers.stream().forEach(e -> System.out.printf("%d ", e));
    }
}
