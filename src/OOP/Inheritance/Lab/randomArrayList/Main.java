package OOP.Inheritance.Lab.randomArrayList;

public class Main {
    public static void main(String[] args) {

        RandomArrayList list = new RandomArrayList();

        list.add(13);
        list.add(42);
        list.add(73);
        list.add(69);
        list.add(51);

        System.out.println(list.getRandomElement());
    }
}
