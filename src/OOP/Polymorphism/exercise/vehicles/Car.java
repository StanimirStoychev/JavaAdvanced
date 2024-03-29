package OOP.Polymorphism.exercise.vehicles;

public class Car extends AbstractVehicle{

    private static final double FUEL_CONSUMPTION_INCREASE = 0.9;

    public Car(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        super(fuelQuantity, fuelConsumption + FUEL_CONSUMPTION_INCREASE, tankCapacity);
    }

    @Override
    public String drive(double kilometers) {
        return "Car " + super.drive(kilometers);
    }

    @Override
    public void printFuelQuantity() {
        System.out.print("Car");
        super.printFuelQuantity();
    }
}