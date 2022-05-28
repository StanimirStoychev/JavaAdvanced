package MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixShuffling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] size = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        int rows = size[0];
        int cols = size[1];
        String[][] matrix = new String[rows][];

        for (int i = 0; i < rows; i++) {
            matrix[i] = scanner.nextLine().split(" ");
        }

        String command = scanner.nextLine();
        while (!command.equals("END")) {
            String[] input = command.split(" ");
            if (!input[0].equals("swap") || input.length != 5) {
                System.out.println("Invalid input!");
                command = scanner.nextLine();
                continue;
            }
            int r1 = Integer.parseInt(input[1]);
            int c1 = Integer.parseInt(input[2]);
            int r2 = Integer.parseInt(input[3]);
            int c2 = Integer.parseInt(input[4]);
            if (!indexIsValid(r1, rows) || !indexIsValid(c1, cols) || !indexIsValid(r2, rows) || !indexIsValid(c2, cols)) {
                System.out.println("Invalid input!");
                command = scanner.nextLine();
                continue;
            }
            String oldMatrix = matrix[r1][c1];
            matrix[r1][c1] = matrix[r2][c2];
            matrix[r2][c2] = oldMatrix;

            command = scanner.nextLine();
            printMatrix(matrix);
        }

    }

    private static boolean indexIsValid(int i, int max) {
        return i >= 0 && i < max;
    }

    private static void printMatrix(String[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
