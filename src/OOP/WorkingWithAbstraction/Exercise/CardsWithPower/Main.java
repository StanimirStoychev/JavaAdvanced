package OOP.WorkingWithAbstraction.Exercise.CardsWithPower;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String rank = scanner.nextLine();
        String suit = scanner.nextLine();

        Card card = new Card(CardRank.valueOf(rank), CardSuit.valueOf(suit));

        int cardPower = card.getRank().getPower() +  card.getSuit().getPower();

        System.out.printf("Card name: %s of %s; Card power: %d",
                card.getRank(), card.getSuit(), cardPower);
    }
}
