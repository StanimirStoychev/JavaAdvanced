package Advanced.MultidimensionalArrays.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class p6_PrintDiagonalsOfSquareMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = Integer.parseInt(scanner.nextLine());

        int[][] matrix = new int[length][];

        fillTheMatrix(scanner, length, matrix);

        printFirstDiagonal(length, matrix);

        printSecondDiagonal(length, matrix);
    }

    private static void printSecondDiagonal(int length, int[][] matrix) {
        int colIndex = 0;
        for (int row = length - 1; row >= 0 ; row--) {
            System.out.print(matrix[row][colIndex] + " ");
            colIndex++;
        }
    }

    private static void printFirstDiagonal(int length, int[][] matrix) {
        for (int row = 0; row < length; row++) {
            System.out.print(matrix[row][row] + " ");
        }
        System.out.println();
    }

    private static void fillTheMatrix(Scanner scanner, int length, int[][] matrix) {
        for (int row = 0; row < length; row++) {
            int[] arr = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            matrix[row] = arr;
        }
    }
}
