package OOP.Polymorphism.vehicles1;

import java.text.DecimalFormat;

public abstract class AbstractVehicle implements Vehicle {
    private double fuelQuantity;
    private double fuelConsumption;

    public AbstractVehicle(double fuelQuantity, double fuelConsumption) {
        this.fuelQuantity = fuelQuantity;
        this.fuelConsumption = fuelConsumption;
    }

    DecimalFormat df = new DecimalFormat("#.##");

    public double getFuelQuantity() {
        return fuelQuantity;
    }

    public void setFuelQuantity(double fuelQuantity) {
        this.fuelQuantity = fuelQuantity;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    @Override
    public String drive(double kilometers) {
        if (!hasEnoughFuel(kilometers)) {
            return "needs refueling";
        }
        consumeFuel(kilometers);

        return "travelled " + df.format(kilometers) + " km";
    }

    @Override
    public void refuel(double liters) {
        fuelQuantity += liters;
    }

    protected boolean hasEnoughFuel(double kilometers) {
        double totalFuel = kilometers * getFuelConsumption();
        return totalFuel < fuelQuantity;
    }

    protected void consumeFuel(double kilometers) {
        fuelQuantity -= kilometers * fuelConsumption;
    }

    @Override
    public void printFuelQuantity() {
        System.out.printf(": %.2f%n", fuelQuantity);
    }
}
