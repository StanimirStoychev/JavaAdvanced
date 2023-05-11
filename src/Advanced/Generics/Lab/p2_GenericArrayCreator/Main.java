package Advanced.Generics.Lab.p2_GenericArrayCreator;

public class Main {
    public static void main(String[] args) {

        String[] strings = ArrayCreator.create(10, "none");
        Integer[] integers = ArrayCreator.create(Integer.class, 10, 0);

        for (String string : strings) {
          System.out.print(string + " ");
        }

        System.out.println();

        for (Integer integer : integers) {
            System.out.print(integer + " ");
        }
    }
}
