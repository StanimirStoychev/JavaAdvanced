package ExamPreparation;

import java.util.Scanner;

public class MouseAndCheese {

    private static int row = 0;
    private static int col = 0;
    private static int eatenCheese = 0;
    private static boolean mouseIsInField = true;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());
        
        char[][] field = new char[size][size];

        for (int i = 0; i < size; i++) {
            String input = scanner.nextLine();
            field[i] = input.toCharArray();

            if (input.contains("M")) {
                row = i;
                col = input.indexOf("M");
            }
        }

        String command;
        while (!"end".equals(command = scanner.nextLine())) {
            switch (command) {
                case "up":
                    moveMouse(field, -1, 0);
                    break;
                case "down":
                    moveMouse(field, 1, 0);
                    break;
                case "left":
                    moveMouse(field, 0, -1);
                    break;
                case "right":
                    moveMouse(field, 0, 1);
                    break;
            }
            if(!mouseIsInField) {
                break;
            }
        }

        if (!mouseIsInField) {
            System.out.println("Where is the mouse?");
        }

        if (eatenCheese >= 5) {
            System.out.println("Great job, the mouse is fed \" + eatenCheese + \" cheeses!");
        } else {
            System.out.println("The mouse couldn't eat the cheeses, she needed " +
                    (5 - eatenCheese) + " cheeses more.");
        }
        
        Print2dArray(field);
    }

    private static void moveMouse(char[][] field, int rowMutator, int colMutator) {
        int nextRow = row + rowMutator;
        int nextCol = col + colMutator;

        boolean isBonusHit = false;

        if (!isInBounds(field, nextRow, nextCol)) {
            field[row][col] = '-';
            mouseIsInField = false;
            return;
        }

        if (field[nextRow][nextCol] == 'c') {
            eatenCheese++;
        } else if (field[nextRow][nextCol] == 'B') {
            isBonusHit = true;
        }

        field[row][col] = '-';
        field[nextRow][nextCol] = 'M';
        row = nextRow;
        col = nextCol;

        if (isBonusHit) {
            moveMouse(field, rowMutator, colMutator);
            isBonusHit = false;
        }
    }

    private static boolean isInBounds(char[][] field, int r, int c) {
        return r >= 0 && r < field.length && c >= 0 && c <= field[r].length;
    }

    private static void Print2dArray(char[][] field) {
        for (char[] chars : field) {
            System.out.println(chars);
        }
    }
}
