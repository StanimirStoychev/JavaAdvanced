package OOP.Polymorphism.vehicles1;

public class Truck extends AbstractVehicle {

    public Truck(double fuelQuantity, double fuelConsumption) {
        super(fuelQuantity, fuelConsumption + 1.6);
    }

    @Override
    public String drive(double kilometers) {
        return "Truck " + super.drive(kilometers);
    }

    @Override
    public void refuel(double liters) {
        setFuelQuantity(getFuelQuantity() + liters * 0.95);
    }

    @Override
    public void printFuelQuantity() {
        System.out.print("Truck");
        super.printFuelQuantity();
    }
}
