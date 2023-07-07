package OOP.WorkingWithAbstraction.Exercise.CardSuit;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String suit = scanner.nextLine();

        System.out.println("Card Suits:");

        int i = 0;

        for (CardSuit card : CardSuit.values()) {
            System.out.printf("Ordinal value: %d; Name value: %s%n", i++, card);
        }
    }
}
