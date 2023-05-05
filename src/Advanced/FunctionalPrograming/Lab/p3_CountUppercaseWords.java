package Advanced.FunctionalPrograming.Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class p3_CountUppercaseWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] textAsArray = scanner.nextLine().split(" ");
        Predicate<String> checkerUppercase =
                word -> Character.isUpperCase(word.charAt(0));
        List<String> result = new ArrayList<>();

        for (String s : textAsArray) {
            if (checkerUppercase.test(s)) {
                result.add(s);
            }
        }

        System.out.println(result.size());
        result.forEach(System.out::println);
    }
}
