package Advanced.SetsAndMapsAdvanced.Lab;

import java.util.*;

public class p3_Voina {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<Integer> firstPlayerCards = new LinkedHashSet<>();
        Set<Integer> secondPlayerCards = new LinkedHashSet<>();

        dealingCards(scanner, firstPlayerCards, secondPlayerCards);

        playGame(firstPlayerCards, secondPlayerCards);

        printOutput(firstPlayerCards, secondPlayerCards);
    }

    private static void printOutput(Set<Integer> firstPlayer, Set<Integer> secondPlayer) {
        if (firstPlayer.size() == secondPlayer.size()) {
            System.out.println("Draw");
        } else if (firstPlayer.size() > secondPlayer.size()) {
            printWinner("First");
        } else {
            printWinner("Second");
        }
    }

    private static void playGame(Set<Integer> firstPlayer, Set<Integer> secondPlayer) {
        int counter = 0;

        while (counter < 50) {

            int firstNumber = firstPlayer.iterator().next();
            firstPlayer.remove(firstNumber);
            int secondNumber = secondPlayer.iterator().next();
            secondPlayer.remove(secondNumber);

            if (firstNumber > secondNumber) {
                addCardsToTheWinnersHand(firstPlayer, firstNumber, secondNumber);
            } else if (secondNumber > firstNumber) {
                addCardsToTheWinnersHand(secondPlayer, firstNumber, secondNumber);
            }

            if (haveEmptyHand(firstPlayer, secondPlayer)) {
                break;
            }

            counter++;

        }
    }

    private static boolean haveEmptyHand(Set<Integer> firstPlayer, Set<Integer> secondPlayer) {
        return firstPlayer.isEmpty() || secondPlayer.isEmpty();
    }

    private static void addCardsToTheWinnersHand(Set<Integer> player, int firstNumber, int secondNumber) {
        player.add(firstNumber);
        player.add(secondNumber);
    }

    private static void printWinner(String player) {
        System.out.printf("%s player win!%n", player);
    }

    private static void dealingCards(Scanner scanner, Set<Integer> firstPlayer, Set<Integer> secondPlayer) {
        int[] firstPlayerCards = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int[] secondPlayerCards = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        for (int i = 0; i < firstPlayerCards.length; i++) {
            firstPlayer.add(firstPlayerCards[i]);
            secondPlayer.add(secondPlayerCards[i]);
        }
    }
}
