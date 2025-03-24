package desafios.desafio5;

public class SavingAccount extends BankAccount{

    public SavingAccount() {
    }

    public SavingAccount(double balance, double deposit) {
        super(balance, deposit);
    }

    public SavingAccount(double balance, double deposit, TypeAccount type) {
        super(balance, deposit, type);
        this.type = TypeAccount.SAVING;
    }

    public SavingAccount(String owner, double balance, double deposit, TypeAccount type) {
        super(owner, balance, deposit, type);
    }
}
