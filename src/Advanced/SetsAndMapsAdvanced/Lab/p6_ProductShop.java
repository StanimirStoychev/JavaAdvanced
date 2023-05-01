package Advanced.SetsAndMapsAdvanced.Lab;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class p6_ProductShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Map<String, Double>> shops = new TreeMap<>();

        String input;

        while (!"Revision".equals(input = scanner.nextLine())) {
            String[] data = input.split(", ");
            String shop = data[0];
            String product = data[1];
            double price = Double.parseDouble(data[2]);

            if (!shops.containsKey(shop)) {
                shops.put(shop, new LinkedHashMap<>());
            }
                shops.get(shop).put(product, price);
        }

        for (var shop : shops.entrySet()) {
            System.out.printf("%s->\n", shop.getKey());
            for (var product : shops.get(shop.getKey()).entrySet()) {
                System.out.printf("Product: %s, Price: %.1f\n", product.getKey(), product.getValue());
            }
        }
    }
}
