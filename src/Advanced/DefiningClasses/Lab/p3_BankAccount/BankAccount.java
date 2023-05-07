package Advanced.DefiningClasses.Lab.p3_BankAccount;

public class BankAccount {

    private final static double DEFAULT_INTEREST_RATE = 0.02;

    private static double interestRate = DEFAULT_INTEREST_RATE;
    private static int bankAccountCount = 1;
    private final int id;
    private double balance;

    public BankAccount() {this.id = bankAccountCount++;}

    public static void setInterestRate(double interestRate) {
        BankAccount.interestRate = interestRate;
    }

    void deposit(double amount) {
        this.balance += amount;
    }

    double getInterest(int years) {
        return BankAccount.interestRate * years * this.balance;
    }

    public int getId(){
        return this.id;
    }
}
