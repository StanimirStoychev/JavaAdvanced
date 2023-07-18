package OOP.InterfacesAndAbstraction.Exercise.collectionHierarchy.classes;

import OOP.InterfacesAndAbstraction.Exercise.collectionHierarchy.interfaces.MyList;

public class MyListImpl extends Collection implements MyList {

    public MyListImpl() {
        super();
    }

    @Override
    public String remove() {
        return getItems().remove(0);
    }

    @Override
    public int add(String element) {
        if (getItems().size() < getMaxSize()) {
            shiftRight();
            getItems().set(0, element);
        }

        return 0;
    }

    private void shiftRight() {

        getItems().add(" ");

        for (int i = getItems().size() - 1; i > 0; i--) {
            getItems().set(i, getItems().get(i - 1));
        }
    }

    @Override
    public int getUsed() {
        return getItems().size();
    }
}
