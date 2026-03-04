package lab2.Problem3;

public class CheckAcc extends Account {
    public static final int FREE_TRANSACTIONS = 3;

    private int transactionCount;

    public CheckAcc(int accNumber) {
        super(accNumber);
        this.transactionCount = 0;
    }
    @Override
    public void deposit(double sum) {
        super.deposit(sum);
        if (sum > 0) transactionCount++;
    }

    @Override
    public void withdraw(double sum) {
        double before = getBalance();
        super.withdraw(sum);
        if (getBalance() != before) transactionCount++;
    }
    public void deductFee() {
        int extra = transactionCount - FREE_TRANSACTIONS;
        if (extra > 0) {
            double fee = extra * 0.02;
            super.withdraw(fee);
        }
        transactionCount = 0;
    }

    public int getTransactionCount() {
        return transactionCount;
    }
    @Override
    public String toString() {
        return "CheckingAccount #" + getAccountNumber() +
                " balance=" + getBalance() +
                " transactions=" + transactionCount;
    }
}
