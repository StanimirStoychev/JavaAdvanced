package Advanced.ExamPreparation;

import java.util.*;
import java.util.stream.Collectors;

public class AutumnCocktails {

    private static int pearSour = 0;
    private static int theHarvest = 0;
    private static int appleHinny = 0;
    private static int highFashion = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> ingredientQueue = Arrays.stream(scanner.nextLine().split("\\s+"))
                        .map(Integer::parseInt)
                        .collect(Collectors.toCollection(ArrayDeque::new));
        ArrayDeque<Integer> levelStack = new ArrayDeque<>();
        Arrays.stream(scanner.nextLine().split("\\s+"))
                        .map(Integer::parseInt)
                        .forEach(levelStack::push);
        Map<String, Integer> mixedCocktails = new TreeMap<>();

        while (!ingredientQueue.isEmpty() && !levelStack.isEmpty()) {
            int currentIngredient = ingredientQueue.poll();
            if (currentIngredient == 0) {
                continue;
            }
            int currentLevel = levelStack.pop();
            int sum = currentIngredient * currentLevel;
            String cocktailName = null;


            switch (sum) {
                case 150:
                    cocktailName = "Pear Sour";
                    putInMap(mixedCocktails, cocktailName);
                    pearSour++;
                    break;
                case 250:
                    cocktailName = "The Harvest";
                    putInMap(mixedCocktails, cocktailName);
                    theHarvest++;
                    break;
                case 300:
                    cocktailName = "Apple Hinny";
                    putInMap(mixedCocktails, cocktailName);
                    appleHinny++;
                    break;
                case 400:
                    cocktailName = "High Fashion";
                    putInMap(mixedCocktails, cocktailName);
                    highFashion++;
                    break;
            }
            if (cocktailName == null) {
                ingredientQueue.offer(currentIngredient + 5);
            }
        }

        if (haveNeededCocktails()) {
            System.out.println("It's party time! The cocktails are ready!");
        } else {
            System.out.println("What a pity! You didn't manage to prepare all cocktails.");
        }

        if (!ingredientQueue.isEmpty()) {
            int sum = ingredientQueue.stream().reduce(0, Integer::sum);
            System.out.printf("Ingredients left: %d%n", sum);
        }

        mixedCocktails.entrySet().forEach(k -> System.out.printf("# %s --> %d%n", k.getKey(), k.getValue()));

    }

    private static void putInMap(Map<String, Integer> mixedCocktails, String cocktailName) {
        mixedCocktails.putIfAbsent(cocktailName, 0);
        mixedCocktails.put(cocktailName, mixedCocktails.get(cocktailName) + 1);
    }

    private static boolean haveNeededCocktails() {
        return pearSour > 0 && theHarvest > 0 && appleHinny > 0 && highFashion > 0;
    }
}
