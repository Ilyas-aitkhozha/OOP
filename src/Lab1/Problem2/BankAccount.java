package Lab1.Problem2;
enum AccountType {
    SAVINGS,
    CREDIT,
}

public class BankAccount {
    public static final String BANK_NAME = "Astana Bank";
    private static int totalAccounts;
    private final int accountId;
    private String ownerName;
    private double balance;
    private AccountType type;
    {totalAccounts++;}
    public BankAccount(int accountId, String ownerName, AccountType t) {
        this.accountId = accountId;
        this.ownerName = ownerName;
        type = t;
        balance = 0.0;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void deposit(double amount, String comment) {
        balance += amount;
        System.out.println("Deposit comment: " + comment);
    }

    public int getAccountId() {
        return accountId;
    }

    public static int getTotalAccounts() {
        return totalAccounts;
    }

    public String toString() {
        return "BankAccount{" + "accountId=" + accountId +  ", ownerName='" + ownerName + '\'' +
                ", balance=" + balance +  ", type=" + type + '}';
    }
}
