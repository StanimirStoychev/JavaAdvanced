package MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixOfPalindromes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] input = Arrays.stream(scanner.nextLine().split(" "))
                        .mapToInt(Integer::parseInt).toArray();

        int rows = input[0];
        int cols = input[1];
        String[][] matrix = new String[rows][cols];

        palindrome(rows, cols, matrix);

        printMatrix(rows, cols, matrix);
    }

    private static void printMatrix(int rows, int cols, String[][] matrix) {
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                System.out.printf("%s ", matrix[row][col]);
            }
            System.out.println();
        }
    }

    private static void palindrome(int rows, int cols, String[][] matrix) {
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                char outside = (char) ('a' + row);
                char middle = (char) (outside + col);
                matrix[row][col] = "" + outside + middle + outside;
            }
        }
    }
}
