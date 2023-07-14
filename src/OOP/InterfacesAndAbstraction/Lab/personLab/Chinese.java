package OOP.InterfacesAndAbstraction.Lab.personLab;

public class Chinese extends BasePerson{

    private String name;

    public Chinese(String name) {
        super(name);
    }

    @Override
    public String sayHello() {
        return "Djydjybydjy";
    }
}
