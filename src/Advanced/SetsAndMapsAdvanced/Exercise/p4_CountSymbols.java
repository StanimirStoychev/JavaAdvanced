package Advanced.SetsAndMapsAdvanced.Exercise;

import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class p4_CountSymbols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        Map<Character, Integer> counts = new TreeMap<>();

        for (int i = 0; i < text.length(); i++) {
            char symbol = text.charAt(i);
            counts.putIfAbsent(symbol, 0);
            counts.put(symbol, counts.get(symbol) + 1);
        }
        Iterator iterator = counts.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<Character, Integer> pair = (Map.Entry)iterator.next();
            System.out.printf("%s: %d time/s%n", pair.getKey(), pair.getValue());
        }
    }
}
