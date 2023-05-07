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
                    System.out.printf("Account ID%d created%n", bankAccount.getId());
                    break;
                case "Deposit":
                    if (bankAccounts.containsKey(Integer.parseInt(input[1]))) {
                        bankAccounts.get(Integer.parseInt(input[1])).deposit(Double.parseDouble(input[2]));
                        System.out.printf("Deposited %.0f to ID%d%n", Double.parseDouble(input[2]),
                                Integer.parseInt(input[1]));
                    } else {
                        System.out.println(ACCOUNT_DOESNT_EXIST);
                    }
                    break;
                case "SetInterest":
                    BankAccount.setInterestRate(Double.parseDouble(input[1]));
                    break;
                case "GetInterest":
                    if (bankAccounts.containsKey(Integer.parseInt(input[1]))) {
                        double getInterest = bankAccounts.get(Integer.parseInt(input[1]))
                                .getInterest(Integer.parseInt(input[2]));
                        System.out.printf("%.2f%n", getInterest);
                    } else {
                        System.out.println(ACCOUNT_DOESNT_EXIST);
                    }
                    break;
            }
        }
    }
}
