package Lab.SmartArray;

public class TestSmartArray {
    public static void main(String[] args) {

        SmartArray smartArray = new SmartArray();

        smartArray.add(4);
        smartArray.add(5);
        smartArray.add(2);
        smartArray.add(7);
        smartArray.add(1);

        System.out.println("Show array after add elements");
        showAllElements(smartArray);
        System.out.println();
        
        smartArray.remove(0);

        System.out.println("Show array after removing a element");
        showAllElements(smartArray);
        System.out.println();

        smartArray.add(0, 12);

        System.out.println("Show array after adding element at index 0");
        showAllElements(smartArray);
        System.out.println();

        System.out.println("Show contains method");
        System.out.println(smartArray.contains(12));
        System.out.println(smartArray.contains(6));
        System.out.println();

        System.out.println("Show all elements incremented while testing forEach() method");
        smartArray.forEach(x -> System.out.printf("Incremented element : %d%n", x + 1));



    }

    private static void showAllElements(SmartArray smartArray) {
        smartArray.forEach(System.out::println);
    }
}
