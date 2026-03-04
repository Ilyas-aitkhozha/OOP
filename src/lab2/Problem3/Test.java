package lab2.Problem3;

public class Test {
    public static void main(String[] args) {
        Bank bank = new Bank();
        SavingsAccount sa = new SavingsAccount(1001, 5.0);
        CheckAcc ca = new CheckAcc(2001);
        bank.openAccount(sa);
        bank.openAccount(ca);

        sa.deposit(100);
        ca.deposit(10);
        ca.deposit(10);
        ca.deposit(10);
        ca.deposit(10);

        System.out.println("Before update ");
        sa.print();
        ca.print();

        bank.update();
        System.out.println("After update:");
        sa.print();
        ca.print();
        sa.transfer(20, ca);
        System.out.println("After transfer 20:");
        sa.print();
        ca.print();
        sa.print();
        ca.print();
        System.out.println(bank.findAccount(1001));
    }
}