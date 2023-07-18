package OOP.InterfacesAndAbstraction.Exercise.collectionHierarchy.classes;

import OOP.InterfacesAndAbstraction.Exercise.collectionHierarchy.interfaces.Addable;

public class AddCollection extends Collection implements Addable {

    public AddCollection() {
        super();
    }

    @Override
    public int add(String element) {
        if (getItems().size() < getMaxSize()) {
            getItems().add(element);
        }
        return super.getItems().size() - 1;
    }
}
