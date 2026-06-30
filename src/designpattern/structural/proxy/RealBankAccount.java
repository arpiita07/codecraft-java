package designpattern.structural.proxy;

public class RealBankAccount  implements Bankaccount {

    private int balance = 1000;

    @Override
    public void withdraw(int amount) {

        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdraw successful: " + amount);
            System.out.println("Remaining balance: " + balance);
        } else {
            System.out.println("Insufficient balance");
        }
    }
}
