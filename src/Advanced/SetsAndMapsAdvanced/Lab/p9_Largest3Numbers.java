package Advanced.SetsAndMapsAdvanced.Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class p9_Largest3Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .sorted((n1, n2) -> n2.compareTo(n1))
                .collect(Collectors.toList());

        for (int i = 0; i < 3; i++) {
                System.out.print(numbers.get(i) + " ");
                if (i + 1 == numbers.size()) {
                    break;
                }

        }
    }
}
