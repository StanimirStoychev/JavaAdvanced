package OOP.DesignPatterns.Singleton.zoo;

import java.util.HashMap;
import java.util.Map;

public class Zoo {

    private HashMap<String, Integer> animals;
    private static Zoo instance;

    public Zoo() {
        animals = new HashMap<>();
    }

    public static Zoo getInstance() {
        if (instance == null) {
            instance = new Zoo();
        }

        return instance;
    }

    public HashMap<String, Integer> getAnimals() {
        return animals;
    }
}
