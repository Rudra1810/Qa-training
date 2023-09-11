package Oop;
public class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = Math.max(initialBalance, 0); // Ensure balance is not negative
    }

    public boolean deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            return true;
        } else {
            return false;
        }
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            return true;
        } else {
            return false;
        }
    }

    public double checkBalance() {
        return balance;
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount("123456789", 0);
        System.out.println("Initial Balance: " + account.checkBalance()); // Output: 0.0

        account.deposit(100);
        System.out.println("After Deposit: " + account.checkBalance()); // Output: 100.0

        account.withdraw(50);
        System.out.println("After Withdrawal: " + account.checkBalance()); // Output: 50.0

        account.withdraw(75);
        System.out.println("After Invalid Withdrawal: " + account.checkBalance()); // Output: 50.0
    }
}
