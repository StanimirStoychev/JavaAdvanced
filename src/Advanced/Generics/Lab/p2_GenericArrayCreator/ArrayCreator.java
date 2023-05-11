package Advanced.Generics.Lab.p2_GenericArrayCreator;

import java.lang.reflect.Array;

public class ArrayCreator {

    @SuppressWarnings("unchecked")
    public static <T> T[] create(int length, T item) {
        T[] array = (T[]) Array.newInstance(item.getClass(), length);

        for (int i = 0; i < array.length; i++) {
            array[i] = item;
        }
        return array;
    }

    @SuppressWarnings("unchecked")
    public static <T> T[] create(Class<T> cl, int length, T item) {
        T[] array = (T[]) Array.newInstance(cl, length);
        for (int i = 0; i < array.length; i++) {
            array[i] = item;
        }
        return array;
    }
}
