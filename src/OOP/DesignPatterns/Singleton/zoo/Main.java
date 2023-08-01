package OOP.DesignPatterns.Singleton.zoo;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee();
        Owner owner = new Owner();
        Zoo zoo = Zoo.getInstance();
        Zoo zo0 = Zoo.getInstance();

        owner.buyAnimal("Zebra", 5);
        employee.feedAnimals();
    }
}
