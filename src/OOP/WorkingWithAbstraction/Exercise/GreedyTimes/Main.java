package OOP.WorkingWithAbstraction.Exercise.GreedyTimes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static String item;
    static String itemKind;
    static long quantity;
    static long quantityInTheBag;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        long bagCapacity = Long.parseLong(scanner.nextLine());
        String[] treasure = scanner.nextLine().split("\\s+");

        List<ItemKind> bag = new ArrayList<>();

        for (int i = 0; i < treasure.length; i += 2) {
            item = treasure[i];
            quantity = Long.parseLong(treasure[i + 1]);

            itemKind = getItemKind();

            if (itemKind == null ||
                    bagCapacity < quantityInTheBag + quantity ||
                    notCoverRules()) {
                continue;
            }

            putItemInBag(bag);
        }

        print(bag);
    }

    private static void putItemInBag(List<ItemKind> bag) {
        if (bag.contains(ItemKind.parse(itemKind))) {
            int index = bag.indexOf(ItemKind.parse(itemKind));
            ItemKind itemKindToUpdate = bag.get(index);
            itemKindToUpdate.addItem(item, quantity);
        } else {
            Item itemToPut = new Item(item, quantity);
            List<Item> listToPut = new ArrayList<>();
            listToPut.add(itemToPut);
            ItemKind.parse(itemKind).setListOfItems(listToPut);
            bag.add(ItemKind.parse(itemKind));
        }

        quantityInTheBag += quantity;
    }

    private static void print(List<ItemKind> bag) {
        bag.forEach(s -> System.out.println(s.getInfo()));
    }

    private static boolean notCoverRules() {
        long goldInBag = ItemKind.GOLD.sumQuantity();
        long gemInBag = ItemKind.GEM.sumQuantity();
        long newItemKindQuantity = ItemKind.parse(itemKind).sumQuantity() + quantity;

        if (itemKind.equals("Gem") && quantity > goldInBag) {
            return true;
        }

        return itemKind.equals("Cash") && (quantity > goldInBag || newItemKindQuantity > gemInBag);
    }

    private static String getItemKind() {
        itemKind = null;

        if (item.length() == 3) {
            itemKind = "Cash";
        } else if (item.toLowerCase().endsWith("gem")) {
            itemKind = "Gem";
        } else if (item.equals("Gold")) {
            itemKind = "Gold";
        }

        return itemKind;
    }
}