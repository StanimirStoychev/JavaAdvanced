package Advanced.Generics.Box;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Box<Double> stringBox = new Box<>();

        for (int i = 0; i < n; i++) {
            double element = Double.parseDouble(scanner.nextLine());
            stringBox.add(element);
        }

        double elementToCompare = Double.parseDouble(scanner.nextLine());
        System.out.println(stringBox.countGreaterItems(elementToCompare));
    }
}
