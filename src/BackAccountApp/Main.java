package BackAccountApp;

public class Main {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount("abc123", 25000);
        myAccount.deposit(10000);
        System.out.println(myAccount.getBalance());
        myAccount.withdraw(30000);
        System.out.println(myAccount.getBalance());
        myAccount.withdraw(10000);
        System.out.println(myAccount.getBalance());
    }
}