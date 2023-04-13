package Advanced.MultidimensionalArrays.Exercise;

import java.util.Scanner;

public class Diagonal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());
        int[][] matrix = new int[size][size];
        readMatrix(scanner, size, matrix);

        int mainDiagSum = 0;
        mainDiagSum = mainDiagonalSum(size, matrix, mainDiagSum);
        int secondDiagSum = 0;
        secondDiagSum = secondDiagonalSum(size, matrix, secondDiagSum);

        int result = Math.abs(mainDiagSum - secondDiagSum);

        System.out.println(result);


    }

    private static int secondDiagonalSum(int size, int[][] matrix, int sum) {
        for (int row = 0, col = size - 1; row < size; row++, col--) {
            sum += matrix[row][col];
        }
        return sum;
    }

    private static int mainDiagonalSum(int size, int[][] matrix, int sum) {
        for (int counter = 0; counter < size; counter++) {
            sum += matrix[counter][counter];
        }
        return sum;
    }

    private static void readMatrix(Scanner scanner, int size, int[][] matrix) {
        for (int row = 0; row < size; row++) {
            String[] rowInput = scanner.nextLine().split(" ");
            for (int col = 0; col < size; col++) {
                matrix[row][col] = Integer.parseInt(rowInput[col]);
            }
        }
    }
}
