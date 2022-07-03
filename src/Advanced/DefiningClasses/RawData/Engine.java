package Advanced.DefiningClasses.RawData;

public class Engine {
    private int speed;
    private int power;

    public int getSpeed() {
        return speed;
    }

    public int getPower() {
        return power;
    }

    public Engine(int speed, int power) {
        this.speed = speed;
        this.power = power;
    }
}