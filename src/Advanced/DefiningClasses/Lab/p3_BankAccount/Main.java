package Advanced.DefiningClasses.Lab.p3_BankAccount;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    private final static String ACCOUNT_DOESNT_EXIST = "Account does not exist";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<Integer, BankAccount> bankAccounts = new HashMap<>();

        String command;

        while (!"End".equals(command = scanner.nextLine())) {
            String[] input = command.split(" ");
            String cmdType = input[0];
            switch (cmdType) {
                case "Create":
                    BankAccount bankAccount = new BankAccount();
                    bankAccounts.put(bankAccount.getId(), bankAccount);
                    printAccountCreated(bankAccount);
                    break;
                case "Deposit":
                    if (bankAccounts.containsKey(Integer.parseInt(input[1]))) {
                        deposit(bankAccounts, input);
                        printDepositInfo(input);
                    } else {
                        printAccountDoesntExist();
                    }
                    break;
                case "SetInterest":
                    setInterest(input);
                    break;
                case "GetInterest":
                    if (bankAccounts.containsKey(Integer.parseInt(input[1]))) {
                        double getInterest = getInterest(bankAccounts, input);
                        printInterest(getInterest);
                    } else {
                        printAccountDoesntExist();
                    }
                    break;
            }
        }
    }

    private static void printAccountCreated(BankAccount bankAccount) {
        System.out.printf("Account ID%d created%n", bankAccount.getId());
    }

    private static void printInterest(double getInterest) {
        System.out.printf("%.2f%n", getInterest);
    }

    private static void printDepositInfo(String[] input) {
        System.out.printf("Deposited %.0f to ID%d%n", Double.parseDouble(input[2]),
                Integer.parseInt(input[1]));
    }

    private static void deposit(Map<Integer, BankAccount> bankAccounts, String[] input) {
        bankAccounts.get(Integer.parseInt(input[1])).deposit(Double.parseDouble(input[2]));
    }

    private static void printAccountDoesntExist() {
        System.out.println(ACCOUNT_DOESNT_EXIST);
    }

    private static void setInterest(String[] input) {
        BankAccount.setInterestRate(Double.parseDouble(input[1]));
    }

    private static double getInterest(Map<Integer, BankAccount> bankAccounts, String[] input) {
        return bankAccounts.get(Integer.parseInt(input[1]))
                .getInterest(Integer.parseInt(input[2]));
    }
}
