package OOP.DesignPatterns.Factory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String cakeType = scanner.nextLine();

        Cake cake = PastryShop.orderCake(cakeType);
    }
}
