package lab2.Problem3;

public class SavingsAccount extends Account {
    private double interestRate; //percent

    public SavingsAccount(int accNumber, double interestRate) {
        super(accNumber);
        this.interestRate = interestRate;
    }
    public void addInterest() {
        double interest = getBalance() * (interestRate / 100.0);
        deposit(interest);
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public String toString() {
        return "SavingsAccount #" + getAccountNumber() +" balance=" + getBalance() + "intereRate=" + interestRate + "%";
    }
}
