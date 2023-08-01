package OOP.DesignPatterns.Factory;

public class SpinachCake extends Cake {

    public SpinachCake(double diameter, double price, int pieces) {
        super(diameter, price, pieces);
    }

    @Override
    public void prepare() {
        System.out.println("Preparing spinach cake");
    }

    @Override
    public void bake() {
        System.out.println("Baking spinach cake");
    }

    @Override
    public void box() {
        System.out.println("Boxing spinach cake");
    }
}
