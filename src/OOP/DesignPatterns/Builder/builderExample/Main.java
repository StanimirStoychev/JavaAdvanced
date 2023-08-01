package OOP.DesignPatterns.Builder.builderExample;

public class Main {
    public static void main(String[] args) {

        Person person = Person.builder().withFirstName("Stanimir")
                .withLastName("Stoychev")
                .withAddress("Gabrovo")
                .build();
    }
}
