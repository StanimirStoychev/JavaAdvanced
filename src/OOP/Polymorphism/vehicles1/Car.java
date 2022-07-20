package OOP.Polymorphism.vehicles1;

public class Car extends AbstractVehicle{

    public Car(double fuelQuantity, double fuelConsumption) {
        super(fuelQuantity, fuelConsumption + 0.9);
    }

    @Override
    public String drive(double kilometers) {
        return "Car " + super.drive(kilometers);
    }

    @Override
    public void refuel(double liters) {
        super.refuel(liters);
    }

    @Override
    public void printFuelQuantity() {
        System.out.print("Car");
        super.printFuelQuantity();
    }
}
