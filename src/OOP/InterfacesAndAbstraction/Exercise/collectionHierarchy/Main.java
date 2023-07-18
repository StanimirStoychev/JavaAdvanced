package OOP.InterfacesAndAbstraction.Exercise.collectionHierarchy;

import OOP.InterfacesAndAbstraction.Exercise.collectionHierarchy.classes.AddCollection;
import OOP.InterfacesAndAbstraction.Exercise.collectionHierarchy.classes.AddRemoveCollection;
import OOP.InterfacesAndAbstraction.Exercise.collectionHierarchy.classes.MyListImpl;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        var addable = new AddCollection();
        var addRemovable = new AddRemoveCollection();
        var myList = new MyListImpl();

        String[] input = scanner.nextLine().split("\\s+");
        int removingAmount = Integer.parseInt(scanner.nextLine());

        for (String element : input) {
            System.out.print(addable.add(element) + " ");
        }
        System.out.println();

       for (String element : input) {
            System.out.print(addRemovable.add(element) + " ");
        }
        System.out.println();

        for (String element : input) {
            System.out.print(myList.add(element) + " ");
        }
        System.out.println();

        for (int i = 0; i < removingAmount; i++) {
            System.out.print(addRemovable.remove() + " ");
        }
        System.out.println();

        for (int i = 0; i < removingAmount; i++) {
            System.out.print(myList.remove() + " ");
        }
        System.out.println();
    }
}
