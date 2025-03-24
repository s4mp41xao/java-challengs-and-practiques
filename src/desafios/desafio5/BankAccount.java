package desafios.desafio5;

public abstract class BankAccount implements Account{

    String owner;
    double balance;
    double deposit;
    TypeAccount type;

    public BankAccount() {
    }

    public BankAccount(double balance, double deposit) {
        this.balance = balance;
        this.deposit = deposit;
    }

    public BankAccount(double balance, double deposit, TypeAccount type) {
        this(balance, deposit);
        this.type = type;
    }

    public BankAccount(String owner, double balance, double deposit, TypeAccount type) {
        this(balance, deposit, type);
        this.owner = owner;
    }

    public void checkBalance() {
        System.out.println(owner + " balance is: " + balance);
    }

    public void deposit() {
        System.out.println("You received a deposit of: " + deposit);
    }

    public void setBalance() {
        System.out.println("Now " + owner + " balance is: " + (balance += deposit * 0.99));
    }

    public void transferAccounts(double value, BankAccount target) {
        this.balance -= value;
        target.balance += value;
        System.out.println(this.owner + " sent " + value + " to " + target.owner);
    }
}
