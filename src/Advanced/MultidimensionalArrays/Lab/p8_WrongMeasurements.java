package Advanced.MultidimensionalArrays.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class p8_WrongMeasurements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = Integer.parseInt(scanner.nextLine());

        int[][] matrix = new int[rows][];

        fillTheMatrix(scanner, rows, matrix);

        int[] position = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int rowPosition = position[0];
        int colPosition = position[1];

        int number = matrix[rowPosition][colPosition];

        replaceWrongNumbers(rows, matrix, number);

        printOutput(rows, matrix);
    }

    private static void printOutput(int rows, int[][] matrix) {
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }

    private static void replaceWrongNumbers(int rows, int[][] matrix, int number) {
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                int currentNumber = matrix[row][col];
                if (currentNumber == number) {

                    int sum = 0;

                    if (row != 0 && matrix[row - 1][col] != number) {
                        int upNum = matrix[row - 1][col];
                        sum += upNum;
                    }
                    if (row != rows - 1 && matrix[row + 1][col] != number) {
                        int downNum = matrix[row + 1][col];
                        sum += downNum;
                    }
                    if (col != 0 && matrix[row][col - 1] != number) {
                        int leftNum = matrix[row][col - 1];
                        sum += leftNum;
                    }
                    if (col != matrix[row].length - 1 && matrix[row][col + 1] != number) {
                        int rightNum = matrix[row][col + 1];
                        sum += rightNum;
                    }

                    matrix[row][col] = sum;
                }
            }
        }
    }

    private static void fillTheMatrix(Scanner scanner, int rows, int[][] matrix) {
        for (int row = 0; row < rows; row++) {
            int[] arr = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            matrix[row] = arr;
        }
    }
}
