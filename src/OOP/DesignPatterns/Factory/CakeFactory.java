package OOP.DesignPatterns.Factory;

public class CakeFactory {

    public static Cake createCake(String cakeType) {
        Cake cake = null;

        switch (cakeType) {
            case "Spinach":
                cake = new SpinachCake(12, 12, 12);
                break;
            case "Chocolate":
                cake = new ChocolateCake(12, 12, 12);
                break;
            case "Biscuit":
                cake = new BiscuitCake(12, 12, 12);
                break;
        }
        return cake;
    }
}
