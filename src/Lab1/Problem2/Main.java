package Lab1.Problem2;

public class Main {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount(1, "Alice", AccountType.SAVINGS);
        BankAccount acc2 = new BankAccount(2, "Bob", AccountType.CREDIT);
        acc1.deposit(500);
        acc2.deposit(1000, "Salary");
        System.out.println(acc1);
        System.out.println(acc2);
        System.out.println("account ID: " + acc1.getAccountId());
        System.out.println("bank name: " + BankAccount.BANK_NAME);
        System.out.println("total accounts: " + BankAccount.getTotalAccounts());
    }
}
