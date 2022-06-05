package DefiningClasses.CarSalesman;

public class Car {
    private String model;
    private Engine engine;
    private String weight;
    String color;

    public Car(String model, Engine engine, String weight, String color) {
        this.model = model;
        this.engine = engine;
        this.weight = weight;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public Engine getEngine() {
        return engine;
    }

    public String getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return String.format("%s:%n%sWeight: %s%nColor: %s%n", this.model, this.engine.toString(), this.weight, this.color);
    }
}
