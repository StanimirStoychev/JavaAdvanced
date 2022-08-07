package OOP.ExceptionsAndErrorHandling;

import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            double sqrt = Math.sqrt(Integer.parseInt(scanner.nextLine()));
            if (sqrt > 0) System.out.printf("%.2f%n", sqrt);
            else System.out.println("Invalid");
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid");
        } finally {
            System.out.println("Goodbye");
        }
    }
}
