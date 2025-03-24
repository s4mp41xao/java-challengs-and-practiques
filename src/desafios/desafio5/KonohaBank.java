package desafios.desafio5;

public class KonohaBank extends BankAccount {

    public KonohaBank() {
    }

    public KonohaBank(double balance, double deposit) {
        super(balance, deposit);
    }

    public KonohaBank(double balance, double deposit, TypeAccount type) {
        super(balance, deposit, type);
    }

    public KonohaBank(String owner, double balance, double deposit, TypeAccount type) {
        super(owner, balance, deposit, type);
    }


}
