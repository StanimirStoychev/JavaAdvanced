package OOP.DesignPatterns.Prototype;

public class Main {
    public static void main(String[] args) {

        EmployeeRecord pesho = new EmployeeRecord(1, "pesho", "more", 150, "Sofia");
        EmployeeRecord pesho1 = pesho.getClone();
        pesho1.showRecord();
    }
}
