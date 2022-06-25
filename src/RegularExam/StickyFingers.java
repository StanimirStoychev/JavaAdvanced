package RegularExam;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class StickyFingers {

    private static int row;
    private static int col;
    private static int pocket;
    private static boolean police = false;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());
        String[] moves = scanner.nextLine().split(",");

        char[][] field = new char[size][size];

        fill2dArray(scanner, size, field);

        for (int i = 0; i < moves.length; i++) {
            String currentMove = moves[i];

            switch (currentMove) {
                case "up":
                    moveD(field, -1, 0);
                    break;
                case "down":
                    moveD(field, 1, 0);
                    break;
                case "left":
                    moveD(field, 0, -1);
                    break;
                case "right":
                    moveD(field, 0, 1);
                    break;
            }

            if (police) {
                break;
            }
        }
            if (!police) {
                System.out.printf("Your last theft has finished successfully with %d$ in your pocket.%n",pocket);
            }

        print2dArray(field);
    }

    private static void fill2dArray(Scanner scanner, int size, char[][] field) {
        for (int i = 0; i < size; i++) {
            char[] input = scanner.nextLine().replace(" ", "").toCharArray();
            field[i] = input;
            String position = Arrays.toString(input);

            for (int j = 0; j < size; j++) {
                if (input[j] == 'D') {
                    row = i;
                    col = j;
                }
            }
        }
    }

    private static void print2dArray(char[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                System.out.print(field[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static boolean isInBounds(char[][] field, int r, int c) {
        return r >= 0 && r < field.length && c >= 0 && c < field[r].length;
    }

    private static void moveD(char[][] field, int rowMutator, int colMutator) {
        int nextRow = row + rowMutator;
        int nextCol = col + colMutator;

        if (isInBounds(field, nextRow, nextCol)) {
            if (field[nextRow][nextCol] == 'P') {
                field[nextRow][nextCol] = '#';
                field[row][col] = '+';
                row = nextRow;
                col = nextCol;
                police = true;
                System.out.printf("You got caught with %d$, and you are going to jail.%n", pocket);
            } else if (field[nextRow][nextCol] == '$') {
                int sum = nextRow * nextCol;
                pocket += sum;
                field[nextRow][nextCol] = 'D';
                field[row][col] = '+';
                row = nextRow;
                col = nextCol;
                System.out.printf("You successfully stole %d$.%n", sum);
            } else if (field[nextRow][nextCol] == '+') {
                field[nextRow][nextCol] = 'D';
                field[row][col] = '+';
                row = nextRow;
                col = nextCol;
            }
        } else {
            System.out.println("You cannot leave the town, there is police outside!");
        }


    }
}
