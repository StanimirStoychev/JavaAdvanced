package OOP.DesignPatterns.Command;

public class IncreaseProductPriceCommand implements Command {

    private final Product product;
    private final int amount;

    public IncreaseProductPriceCommand(Product product, int amount) {
        this.product = product;
        this.amount = amount;
    }

    @Override
    public void executeAction() {
        this.product.increasePrice(this.amount);
        System.out.printf("The price for the %s has been increased by %d$.%n",
                this.product.getName(), this.amount);
    }
}
