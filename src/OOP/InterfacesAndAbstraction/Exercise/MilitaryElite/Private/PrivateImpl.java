package OOP.InterfacesAndAbstraction.Exercise.MilitaryElite.Private;

import OOP.InterfacesAndAbstraction.Exercise.MilitaryElite.soldier.SoldierImpl;

public class PrivateImpl extends SoldierImpl implements Private {

    private final double salary;

    public PrivateImpl(int id, String firstName, String lastName, double salary) {
        super(id, firstName, lastName);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("Salary: %.2f%n", salary);
    }
}
