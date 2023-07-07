package OOP.WorkingWithAbstraction.Exercise.CardRank;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        System.out.println("Card Ranks:");

        int i = 0;

        for (CardRank card : CardRank.values()) {
            System.out.printf("Ordinal value: %d; Name value: %s%n", i++, card);
        }
    }
}
