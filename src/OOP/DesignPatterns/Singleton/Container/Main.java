package OOP.DesignPatterns.Singleton.Container;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<String, Integer> capitals = new HashMap<>();

        capitals.put("Sofia", 120_000);
        capitals.put("Varna", 90_000);

        SingletonDataContainer instance = SingletonDataContainer.getInstance();
        System.out.println(instance.getPopulation(capitals, "Sofia"));

        SingletonDataContainer instance1 = SingletonDataContainer.getInstance();
        System.out.println(instance1.getPopulation(capitals, "Varna"));
    }
}
