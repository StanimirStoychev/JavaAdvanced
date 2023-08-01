package OOP.DesignPatterns.Singleton.zoo;

public class Employee {

    public void feedAnimals() {
        Zoo.getInstance().getAnimals().keySet().forEach(k -> System.out.println("Feeding animal"));
    }
}
