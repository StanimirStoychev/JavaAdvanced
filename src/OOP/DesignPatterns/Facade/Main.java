package OOP.DesignPatterns.Facade;

public class Main {
    public static void main(String[] args) {

        Car car = new CarBuilderFacade()
                .info()
                .withType("BMW")
                .withColor("Black")
                .withDoors(5)
                .built()
                .inCity("Leipzig")
                .atAddress("Some address 254")
                .build();

        System.out.println(car);
    }
}
