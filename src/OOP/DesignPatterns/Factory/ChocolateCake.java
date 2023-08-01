package OOP.DesignPatterns.Factory;

public class ChocolateCake extends Cake {

    public ChocolateCake(double diameter, double price, int pieces) {
        super(diameter, price, pieces);
    }

    @Override
    public void prepare() {
        System.out.println("Preparing chocolate cake");
    }

    @Override
    public void bake() {
        System.out.println("Baking chocolate cake");
    }

    @Override
    public void box() {
        System.out.println("Boxing chocolate cake");
    }
}
