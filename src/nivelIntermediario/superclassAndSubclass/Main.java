package nivelIntermediario.superclassAndSubclass;

public class Main {
    public static void main(String[] args) {

        Uzumaki Naruto = new Uzumaki();
        Naruto.name = "Naruto Uzumaki";
        Naruto.village = "Folha";
        Naruto.age = 17;
        Naruto.spell();

        Uchiha Sasuke = new Uchiha();
        Sasuke.village = "Folha";
        Sasuke.age = 17;
        Sasuke.name = "Sasuke Uchiha";
        Sasuke.BattleStrategyNinja();

        Uchiha Itachi = new Uchiha("Itachi Uchiha", "Leaf", 27);
        Itachi.BattleStrategyNinja();
        Itachi.spell();
    }
}
