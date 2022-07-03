package OOP.WorkingWithAbstraction.Cards;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String rank = scanner.nextLine();
        String suit = scanner.nextLine();
        int sum = CardRank.valueOf(rank).getPower() + CardSuit.valueOf(suit).getPower();

        System.out.printf("Card name: %s of %s; Card power: %d", rank, suit, sum);
    }
}
