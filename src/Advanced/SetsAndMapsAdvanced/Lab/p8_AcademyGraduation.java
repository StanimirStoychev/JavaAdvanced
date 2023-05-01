package Advanced.SetsAndMapsAdvanced.Lab;

import java.util.*;
import java.util.stream.Collectors;

public class p8_AcademyGraduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<Double>> students = new TreeMap<>();

        fillStudentsMap(scanner, students);

        students.forEach((key, value) -> {
            double sum = 0;
            for (Double aDouble : value) {
                sum += aDouble;
            }
            System.out.printf("%s is graduated with %s\n", key, sum / value.size());
        });
    }

    private static void fillStudentsMap(Scanner scanner, Map<String, List<Double>> students) {
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            List<Double> grades = Arrays.stream(scanner.nextLine().split(" "))
                    .map(Double::parseDouble)
                    .collect(Collectors.toList());

            students.put(name, grades);
        }
    }
}
