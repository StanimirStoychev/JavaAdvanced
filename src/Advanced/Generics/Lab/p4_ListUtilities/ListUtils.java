package Advanced.Generics.Lab.p4_ListUtilities;

import java.util.List;

public class ListUtils {

    private final static String EMPTY_COLLECTION = "Empty collection";

    public static <T extends Comparable<T>> T getMin(List<T> list) {
        return list.stream()
                .min(T::compareTo)
                .orElseThrow(() -> new IllegalArgumentException(EMPTY_COLLECTION));
    }

    public static <T extends Comparable<T>> T getMax(List<T> list) {
        return list.stream()
                .max(T::compareTo)
                .orElseThrow(() -> new IllegalArgumentException(EMPTY_COLLECTION));
    }
}
