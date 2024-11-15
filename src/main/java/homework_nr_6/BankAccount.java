package homework_nr_6;

public class BankAccount {

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount){
        this.balance += amount;
    }

    public boolean withdraw(double amount){
        if(this.balance < amount) return false;
        this.balance -= amount;
        return true;
    }

    public static void main(String[] args) {
        BankAccount acc = new BankAccount("12345567890", 365.23);
        acc.deposit(345.98);
        System.out.println("Current balance is " + acc.balance);
        acc.withdraw(65);
        System.out.println("Current balance is " + acc.balance);
    }
    String accountNumber;
    double balance;
}
