package OOP.InterfacesAndAbstraction.carShop;

public interface Rentable extends Car{

    Integer getMinRentDay();
    Double getPricePerDay();
}
