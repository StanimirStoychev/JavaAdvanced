package OOP.InterfacesAndAbstraction.Exercise.collectionHierarchy.classes;

import java.util.ArrayList;
import java.util.List;

public abstract class Collection {

    private final int maxSize = 100;
    private final List<String> items;

    public Collection() {
        items = new ArrayList<>();
    }

    public int getMaxSize() {
        return maxSize;
    }

    public List<String> getItems() {
        return items;
    }
}
