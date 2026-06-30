package designpattern.structural.proxy;

public class BankAccountProxy implements Bankaccount {

    private RealBankAccount realAccount;
    private boolean isAuthenticated;

    public BankAccountProxy(boolean isAuthenticated) {
        this.isAuthenticated = isAuthenticated;
    }

    @Override
    public void withdraw(int amount) {

        // 🔐 Security check (Proxy responsibility)
        if (!isAuthenticated) {
            System.out.println("Access denied: User not authenticated");
            return;
        }

        // Lazy initialization (create real object only when needed)
        if (realAccount == null) {
            realAccount = new RealBankAccount();
        }

        // Forward request to real object
        realAccount.withdraw(amount);
    }

}
