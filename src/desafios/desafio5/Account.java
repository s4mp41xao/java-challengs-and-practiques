package desafios.desafio5;

public interface Account {
    void checkBalance();
    void deposit();
    void setBalance();
    void transferAccounts(double value, BankAccount targetAccount);
}
