package lab2.Problem3;

import java.util.Vector;

public class Bank {
    private Vector<Account> accounts;

    public Bank() {
        accounts = new Vector<Account>();
    }


    public boolean closeAccount(int accountNumber) {
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).getAccountNumber() == accountNumber) {
                accounts.remove(i);
                return true;
            }
        }
        return false;
    }
    public void openAccount(Account account) {
        if (account == null) return;
        accounts.add(account);
    }

    public Account findAccount(int accountNumber) {
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).getAccountNumber() == accountNumber) {
                return accounts.get(i);
            }
        }
        return null;
    }

    public void update() {
        for (int i = 0; i < accounts.size(); i++) {
            Account a = accounts.get(i);

            if (a instanceof SavingsAccount) {
                ((SavingsAccount) a).addInterest();
            }

            if (a instanceof CheckAcc) {
                ((CheckAcc) a).deductFee();
            }
        }
    }

    @Override
    public String toString() {
        return "Bank accounts: " + accounts;
    }
}