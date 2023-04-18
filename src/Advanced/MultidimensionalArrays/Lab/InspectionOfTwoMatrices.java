package Advanced.MultidimensionalArrays.Lab;

import java.util.Scanner;

public class InspectionOfTwoMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rowsOfMatrices = Integer.parseInt(scanner.nextLine());
        int colsOfMatrices = Integer.parseInt(scanner.nextLine());

        String[][] A = new String[rowsOfMatrices][];
        String[][] B = new String[rowsOfMatrices][];

        fillTheMatrix(scanner, rowsOfMatrices, A);
        fillTheMatrix(scanner, rowsOfMatrices, B);

        String[][] C = new String[rowsOfMatrices][colsOfMatrices];

        CompareMatricesAndFillTheResult(rowsOfMatrices, colsOfMatrices, A, B, C);

        printOutput(rowsOfMatrices, C);
    }

    private static void printOutput(int rowsOfMatrices, String[][] C) {
        for (int i = 0; i < rowsOfMatrices; i++) {
            System.out.println(String.join(" ", C[i]));
        }
    }

    private static void CompareMatricesAndFillTheResult(int rowsOfMatrices, int colsOfMatrices, String[][] A, String[][] B, String[][] C) {
        for (int row = 0; row < rowsOfMatrices; row++) {
            for (int col = 0; col < colsOfMatrices; col++) {
                if (A[row][col].equals(B[row][col])) {
                    C[row][col] = A[row][col];
                } else {
                    C[row][col] = "*";
                }
            }
        }
    }

    private static void fillTheMatrix(Scanner scanner, int rowsOfMatrices, String[][] array) {
        for (int row = 0; row < rowsOfMatrices; row++) {
            String[] currentRow = scanner.nextLine().split(" ");
            array[row] = currentRow;
        }
    }
}
