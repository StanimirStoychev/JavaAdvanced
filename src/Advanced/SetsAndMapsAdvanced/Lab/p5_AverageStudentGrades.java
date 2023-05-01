package Advanced.SetsAndMapsAdvanced.Lab;

import java.util.*;

public class p5_AverageStudentGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<Double>> studentGrades = new TreeMap<>();

        fillTheMap(scanner, studentGrades);

        printOutput(studentGrades);
    }

    private static void printOutput(Map<String, List<Double>> studentGrades) {
        for (var student : studentGrades.entrySet()) {
            System.out.print(student.getKey() + " -> ");
            for (int i = 0; i < student.getValue().size(); i++) {
                System.out.printf("%.2f ", student.getValue().get(i));
            }
            System.out.printf("avg: %.2f", student.getValue().stream().mapToDouble(Double::doubleValue).average()
                    .orElseThrow(NoSuchElementException::new));
            System.out.println();
        }
    }

    private static void fillTheMap(Scanner scanner, Map<String, List<Double>> studentGrades) {
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] data = scanner.nextLine().split("\\s+");
            String name = data[0];
            double grade = Double.parseDouble(data[1]);
            studentGrades.putIfAbsent(name, new ArrayList<>());
            studentGrades.get(name).add(grade);
        }
    }
}
