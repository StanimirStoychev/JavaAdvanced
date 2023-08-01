package OOP.DesignPatterns.Builder.phonebook;

import java.util.*;

public class Main {

    private static final String CREATE_COMMAND = "CREATE";
    private static final String CONTACT_INFO_COMMAND = "INFO";
    private static final String DELETE_CONTACT_COMMAND = "DELETE";
    private static final String PHONEBOOK_COMMAND = "PHONEBOOK";
    private static final String END_COMMAND = "END";

    public static void main(String[] args) {

        //Contact contact = Contact.builder()
        //        .withName("Stanimir")
        //        .withNumber("0898765432")
        //        .withEmail("stmbks@abv.bg")
        //        .withBirthday("10/06/1992")
        //        .build();

        //Contact contactFromInput = createContact();
        //System.out.println(contactFromInput);

        Phonebook phonebook = new Phonebook();

        Scanner scanner = new Scanner(System.in);
        String command;

        while (!END_COMMAND.equals(command = scanner.nextLine())) {
            switch (command) {
                case CREATE_COMMAND -> {
                    Contact contact = createContact();
                    phonebook.addContact(contact);
                }
                case CONTACT_INFO_COMMAND -> {
                    System.out.println("Enter contact name:");
                    String name = scanner.nextLine();
                    phonebook.getContactByName(name);
                }
                case DELETE_CONTACT_COMMAND -> {
                    System.out.println("Enter contact name:");
                    String nameD = scanner.nextLine();
                    phonebook.deleteContactByName(nameD);
                }
                case PHONEBOOK_COMMAND -> phonebook.getAllContacts().forEach(System.out::println);
            }
        }

    }

    private static Contact createContact() {
        Scanner scanner = new Scanner(System.in);
        List<String> input = readContactInfo(scanner);

        String name = input.get(0);
        String number = input.get(1);
        String company = input.get(2);
        String title = input.get(3);
        String email = input.get(4);
        String website = input.get(5);
        String birthday = input.get(6);

        return Contact.builder()
                .withName(name)
                .withNumber(number)
                .withCompany(company)
                .withTitle(title)
                .withEmail(email)
                .withWebsite(website)
                .withBirthday(birthday)
                .build();
    }

    private static List<String> readContactInfo(Scanner input) {
        List<String> contactInfo = new ArrayList<>();

        System.out.print("Name: ");
        contactInfo.add(input.nextLine());

        System.out.print("Number: ");
        contactInfo.add(input.nextLine());

        System.out.print("Company: ");
        contactInfo.add(input.nextLine());

        System.out.print("Title: ");
        contactInfo.add(input.nextLine());

        System.out.print("Email: ");
        contactInfo.add(input.nextLine());

        System.out.print("Website: ");
        contactInfo.add(input.nextLine());

        System.out.print("Birthday: ");
        contactInfo.add(input.nextLine());

        return contactInfo;
    }
}
