package Advanced.RegularExam;

import java.util.*;
import java.util.stream.Collectors;

public class ItsChocolateTime {

    private static int milkChocolate = 0;
    private static int darkChocolate = 0;
    private static int bakingChocolate = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Double> milkQueue = Arrays.stream(scanner.nextLine().split("\\s+"))
                        .map(Double::parseDouble)
                        .collect(Collectors.toCollection(ArrayDeque::new));

        ArrayDeque<Double> cacaoStack = new ArrayDeque<>();
        Arrays.stream(scanner.nextLine().split("\\s+"))
                        .map(Double::parseDouble)
                        .forEach(cacaoStack::push);

        Map<String, Integer> mixedChoco = new TreeMap<>();

        while (!milkQueue.isEmpty() && !cacaoStack.isEmpty()) {
            double currentMilk = milkQueue.poll();
            double currentCacao = cacaoStack.pop();
            double sum = currentMilk + currentCacao;
            double result = (currentCacao / sum) * 100;
            String chocoName = null;

            if (result == 30) {
                chocoName = "Milk Chocolate";
                putInMap(mixedChoco, chocoName);
                milkChocolate++;
            } else if (result == 50) {
                chocoName = "Dark Chocolate";
                putInMap(mixedChoco, chocoName);
                darkChocolate++;
            } else if (result == 100) {
                chocoName = "Baking Chocolate";
                putInMap(mixedChoco, chocoName);
                bakingChocolate++;
            }

            if (chocoName == null) {
                milkQueue.offer(currentMilk + 10);
            }
        }

        if (neededChoco()) {
            System.out.println("It’s a Chocolate Time. All chocolate types are prepared.");
        } else {
            System.out.println("Sorry, but you didn't succeed to prepare all types of chocolates.");
        }

        mixedChoco.entrySet().forEach(k -> System.out.printf("# %s --> %d%n", k.getKey(), k.getValue()));

    }

    private static void putInMap(Map<String, Integer> mixedChoco, String chocoName) {
        mixedChoco.putIfAbsent(chocoName, 0);
        mixedChoco.put(chocoName, mixedChoco.get(chocoName) + 1);
    }

    private static boolean neededChoco() {
        return milkChocolate > 0 && darkChocolate > 0 && bakingChocolate > 0;
    }
}
