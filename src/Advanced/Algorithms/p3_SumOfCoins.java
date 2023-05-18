import java.util.*;

public class p3_SumOfCoins {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] elements = scanner.nextLine().substring(7).split(", ");
        int[] coins = new int[elements.length];
        for (int i = 0; i < coins.length; i++) {
            coins[i] = Integer.parseInt(elements[i]);
        }

        int targetSum = Integer.parseInt(scanner.nextLine().substring(5));


        Map<Integer, Integer> usedCoins = chooseCoins(coins, targetSum);

        int countOfCoins = 0;

        for (var coin : usedCoins.entrySet()) {
            countOfCoins += coin.getValue();
        }

        System.out.println("Number of coins to take: " + countOfCoins);

        for (Map.Entry<Integer, Integer> usedCoin : usedCoins.entrySet()) {
            System.out.printf("%d coin(s) with value %d%n", usedCoin.getValue(), usedCoin.getKey());
        }
    }

    public static Map<Integer, Integer> chooseCoins(int[] coins, int targetSum) {
        Map<Integer, Integer> coinsCount = new LinkedHashMap<>();

        int index = coins.length - 1;

        while (targetSum > 0 && index >= 0) {
            int coin = coins[index];

            int coinsToTake = targetSum / coin;

            if (coinsToTake != 0) {
                coinsCount.put(coin, coinsToTake);
            }

            targetSum = targetSum % coin;
            index--;
        }

        return coinsCount;
    }
}