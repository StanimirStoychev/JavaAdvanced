package ExamPreparation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CookingJourney {

    private static int row;
    private static int col;
    private static boolean chefIsInField = true;
    private static int sum = 0;
    private static int p1r;
    private static int p1c;
    private static int p2r;
    private static int p2c;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());
        char[][] pastryShop = new char[size][size];

        fillTheMatrix(scanner, size, pastryShop);

        while (chefIsInField && sum < 50) {
            
        }




        print2dArray(pastryShop);

    }

    private static void print2dArray(char[][] pastryShop) {
        for (char[] chars : pastryShop) {
            System.out.println(chars);
        }
    }

    private static boolean isInBounds(char[][] pastryShop, int r, int c) {
        return r >= 0 && r < pastryShop.length && c >= 0 && c <= pastryShop[r].length;
    }

    private static void moveChef(char[][] pastryShop, int rowMutator, int colMutator) {
        int nextRow = row + rowMutator;
        int nextCol = col + colMutator;

        if (!isInBounds(pastryShop, nextRow, nextCol)) {
            pastryShop[row][col] = '-';
            chefIsInField = false;
            return;
        }

        if (pastryShop[nextRow][nextCol] == 'P') {
            pastryShop[nextRow][nextCol] = '-';
            for (int i = 0; i < pastryShop.length; i++) {
                for (int j = 0; j < pastryShop.length; j++) {
                    if (pastryShop[i][j] == 'P') {
                        row = i;
                        col = j;
                    }
                }
            }
        } else {
            pastryShop[row][col] = '-';
            pastryShop[nextRow][nextCol] = 'S';
            row = nextRow;
            col = nextCol;
        }

        if (pastryShop[nextRow][nextCol] > 48 && pastryShop[nextRow][nextCol] < 58) {
            int currentDigit = Integer.parseInt(String.valueOf(pastryShop[nextRow][nextCol]));
            sum += currentDigit;
        }
    }

        private static void fillTheMatrix(Scanner scanner, int size, char[][] pastryShop) {
        for (int i = 0; i < size; i++) {
            String input = scanner.nextLine();
            pastryShop[i] = input.toCharArray();
            if (input.contains("S")) {
                row = i;
                col = input.indexOf("S");
            }

        }
    }
}
