package Advanced.DefiningClasses.Exercise.CarSalesman;

public class Engine {
    private String model;
    private int power;
    private String displacement = "n/a";
    private String efficiency = "n/a";

    public Engine(String model, int power) {
        this.model = model;
        this.power = power;
    }

    public Engine(String model, int power, String displacement) {
        this.model = model;
        this.power = power;
        this.displacement = displacement;
    }

    public Engine(String model, int power, String displacement, String efficiency) {
        this.model = model;
        this.power = power;
        this.displacement = displacement;
        this.efficiency = efficiency;
    }

    public String getModel() {
        return model;
    }

    public int getPower() {
        return power;
    }

    public String getDisplacement() {
        return displacement;
    }

    public String getEfficiency() {
        return efficiency;
    }

    @Override
    public String toString(){
        return String.format("%s:%nPower: %d%nDisplacement: %s%nEfficiency: %s%n", this.model, this.power, this. displacement, this.efficiency);
    }
}
