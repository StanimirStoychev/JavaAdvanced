package Advanced.ExamPreparation;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Bomb {

    private static int row;
    private static int col;
    private static int bombsHit;
    private static int allBombs;
    private static boolean end = false;
    private static boolean haveBombs = true;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());
        String[] commands = scanner.nextLine().split(",");
        char[][] matrix = new char[size][size];

        for (int i = 0; i < size; i++) {
            List<Character> characters = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .map(e -> e.charAt(0))
                    .collect(Collectors.toList());
            for (int j = 0; j < characters.size(); j++) {
                char currentChar = characters.get(j);
                if (currentChar == 's') {
                    row = i;
                    col = j;
                }
                if (currentChar == 'B') {
                    allBombs++;
                }
                matrix[i][j] = currentChar;
            }
        }

        for (int i = 0; i < commands.length; i++) {
            String currentCommand = commands[i];
        
            switch (currentCommand) {
                case "up":
                    movePosition(matrix, -1, 0);
                    break;
                case "down":
                    movePosition(matrix, 1, 0);
                    break;
                case "left":
                    movePosition(matrix, 0, -1);
                    break;
                case "right":
                    movePosition(matrix, 0, 1);
                    break;
            }
            if (matrix[row][col] == 'B') {
                bombsHit++;
                System.out.println("You found a bomb!");
            }
            if (end) {
                System.out.printf("END! %d bombs on the field", allBombs - bombsHit);
                break;
            } else if (allBombs - bombsHit == 0) {
                System.out.println("Congratulations! You found all bombs!");
                haveBombs = false;
                break;
            }
        }

        if (end && !haveBombs) {
            System.out.printf("%d bombs left on the field. Sapper position: (%d,%d)",allBombs - bombsHit, row, col);
        }
    }

    private static void movePosition(char[][] matrix, int rowMutator, int colMutator) {
        int nextRow = row + rowMutator;
        int nextCol = col + colMutator;


        if (matrix[nextRow][nextCol] == 'e') {
            end = true;
        }

        if (isInBounds(matrix, nextRow,nextCol)) {
            matrix[row][col] = '+';
            matrix[nextRow][nextCol] = 's';
            row = nextRow;
            col = nextCol;
        }
    }

    private static boolean isInBounds(char[][] matrix, int r, int c) {
        return r >= 0 && r < matrix.length && c >= 0 && c <= matrix[r].length;
    }

}
