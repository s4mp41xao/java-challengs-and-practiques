package desafios.desafio5;

public class CheckingAccount extends BankAccount {

    public CheckingAccount() {
    }

    public CheckingAccount(double balance, double deposit) {
        super(balance, deposit);
    }

    public CheckingAccount(double balance, double deposit, TypeAccount type) {
        super(balance, deposit, type);
        this.type = TypeAccount.CHECKING;
    }

    public CheckingAccount(String owner, double balance, double deposit, TypeAccount type) {
        super(owner, balance, deposit, type);
    }
}
