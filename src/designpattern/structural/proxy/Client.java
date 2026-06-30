package designpattern.structural.proxy;

public class Client {
    public static void main(String[] args) {

        // User is authenticated
        Bankaccount account = new BankAccountProxy(true);

        account.withdraw(500);
        account.withdraw(600);

        System.out.println("----");

        // User not authenticated
        Bankaccount account2 = new BankAccountProxy(false);
        account2.withdraw(100);
    }
}
