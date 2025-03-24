package desafios.desafio5;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {

        System.out.println("----------Transfer Between Accounts----------");
        CheckingAccount checkingAccount01 = new CheckingAccount("Bob", 1000, 0, TypeAccount.CHECKING);
        SavingAccount savingAccount01 = new SavingAccount("Alice", 0, 0, TypeAccount.SAVING);

        checkingAccount01.checkBalance();
        checkingAccount01.transferAccounts(200, savingAccount01);
        checkingAccount01.setBalance();
        savingAccount01.checkBalance();

    }


}
