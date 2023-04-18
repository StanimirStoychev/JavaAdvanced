package Advanced.MultidimensionalArrays.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class p2_PositionsOf {

    private static final String NOT_FOUND = "not found";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimensions = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int rows = dimensions[0];

        int[][] matrix = new int[rows][];

        fillTheMatrix(scanner, rows, matrix);

        int desiredNumber = Integer.parseInt(scanner.nextLine());

        numberMatcher(matrix, desiredNumber);
    }

    private static void numberMatcher(int[][] matrix, int desiredNumber) {
        boolean notFound = true;
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] == desiredNumber) {
                    printRowAndCol(row, col);
                    notFound = false;
                }
            }
        }
        if (notFound) {
            System.out.println(NOT_FOUND);
        }
    }

    private static void printRowAndCol(int row, int col) {
        System.out.println(row + " " + col);
    }

    private static void fillTheMatrix(Scanner scanner, int rows, int[][] matrix) {
        for (int i = 0; i < rows; i++) {
            int[] arr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            matrix[i] = arr;
        }
    }
}
