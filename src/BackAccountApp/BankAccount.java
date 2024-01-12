package BackAccountApp;

public class BankAccount {
    String accountNumber;
    double balance;

    // constructor
     BankAccount(String accountNumber, double initBalance) {
         this.accountNumber = accountNumber;
         this.balance = initBalance;
    }

    // get account Number
    String  getAccountNumber (){
         return accountNumber;
    }
    
    // get balance
    double getBalance(){
         return balance;
    }
    
    //deposit function
    void deposit(double amount){
         if(amount > 0){
             balance += amount;
             System.out.println(amount+ "\tis successfully credited to account\t" + this.accountNumber);
         }
         else System.out.println("failed to credit" + amount + "to account" + this.accountNumber);
    }
    
    // withdraw function
    void withdraw(double amount){
         if (amount <= this.balance && amount >0){
             this.balance -= amount;
             System.out.println(amount + "\tis successfully debited from account\t" + this.accountNumber);
         } else System.out.println("Insufficient balance");
    }
}
