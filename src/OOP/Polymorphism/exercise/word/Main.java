package OOP.Polymorphism.exercise.word;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder text = new StringBuilder(scanner.nextLine());

        if (text.toString().isEmpty()) {
            return;
        }

        CommandInterface commandInterface = Initialization.buildCommandInterface(text);

        String inputLine = scanner.nextLine();
        commandInterface.init();

        while(!inputLine.equals("exit")) {
            commandInterface.handleInput(inputLine);
            inputLine = scanner.nextLine();
        }

        System.out.println(text);
    }
}
