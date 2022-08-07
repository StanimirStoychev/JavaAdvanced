package OOP.Polymorphism.animals;

public abstract class Animal {

    private String name;
    private String favouriteFood;

    public Animal(String name, String favouriteFood) {
        this.name = name;
        this.favouriteFood = favouriteFood;
    }

    public String getName() {
        return name;
    }

    public String getFavouriteFood() {
        return favouriteFood;
    }


    public String explainSelf() {
        return String.format("I am %s and my favourite food is %s%n", name, favouriteFood);
    }
}
