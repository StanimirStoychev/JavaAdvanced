package Advanced.DefiningClasses.Exercise.Google;

public class Car {
    String model;
    int speed;

    public Car(String name, int speed) {
        this.model = name;
        this.speed = speed;
    }

    public String getModel() {
        return model;
    }

    public int getSpeed() {
        return speed;
    }

    @Override
    public String toString() {
        return model + " " + speed + System.lineSeparator();
    }
}
