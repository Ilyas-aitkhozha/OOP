package lab2.Problem3;

public class Account {
    private double balance;
    private int accNumber;
    public Account(int accNumber) {
        this.accNumber = accNumber;
        this.balance = 0.0;
    }

    public void deposit(double sum) {
        if (sum <= 0) return;
        balance += sum;
    }

    public void withdraw(double sum) {
        if (sum <= 0) return;
        if (sum > balance) return;
        balance -= sum;
    }

    public double getBalance() {
        return balance;
    }

    public int getAccountNumber() {
        return accNumber;
    }
    public void transfer(double amount, Account other) {
        if (other == null) return;
        if (amount <= 0) return;
        if (amount > balance) return;

        this.withdraw(amount);
        other.deposit(amount);
    }
    @Override
    public String toString() {
        return "Account #" + accNumber + " balance=" + balance;
    }
    public final void print() {
        System.out.println(toString());
    }
}
