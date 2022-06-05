package FunctionalPrograming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateForNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Predicate<String> isLengthOk = name -> name.length() <= n;
        List<String> names = Arrays.stream(scanner.nextLine().split(" "))
                .filter(isLengthOk).collect(Collectors.toList());

        names.stream().forEach(System.out::println);
    }
}
