package nivelIntermediario.polimorfismAndAbstraction;

public class Main {
    public static void main(String[] args) {

        Uchiha Sasuke = new Uchiha();
        Sasuke.name = "Sasuke Uchiha";
        Sasuke.age = 18;
        Sasuke.spell();
        Sasuke.battleStrategyNinja();

        Uzumaki Naruto = new Uzumaki();
        Naruto.name = "Naruto Uzumaki";
        Naruto.age = 17;
        Naruto.spell();
        Naruto.battleStrategyNinja();
    }
}