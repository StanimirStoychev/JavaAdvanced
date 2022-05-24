package MultidimensionalArrays;

import java.util.Scanner;

public class FillTheMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(", ");
        int n = Integer.parseInt(input[0]);
        String pattern = input[1];

        int counter = 1;

        int[][] matrix = new int[n][n];
        switch (pattern) {
            case "A":
            firstPattern(n, counter, matrix);
            break;
            case "B":
            secondPattern(n, counter, matrix);
            break;
        }
        printMatrix(n, matrix);
    }

    private static void secondPattern(int n, int counter, int[][] matrix) {
        for (int row = 0; row < n; row++) {
            if (row % 2 == 0) {
                for (int col = 0; col < n; col++) {
                    matrix[col][row] = counter;
                    counter++;
                }
            } else {
                for (int col = n - 1; col >= 0; col--) {
                    matrix[col][row] = counter;
                    counter++;
                }
            }
        }
    }

    private static void printMatrix(int n, int[][] matrix) {
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }

    private static void firstPattern(int n, int counter, int[][] matrix) {
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                matrix[col][row] = counter;
                counter++;
            }
        }
    }
}
