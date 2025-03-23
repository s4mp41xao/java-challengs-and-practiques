package nivelIntermediario.overloadConstructor;

public class Main {
    public static void main(String[] args) {

        Uzumaki Naruto = new Uzumaki("Naruto Uzumaki", "Leaf", 17, 25, LevelNinja.GENIN);
        Naruto.showInformation();
        Naruto.activatedUzumaki();

        Uchiha Sasuke = new Uchiha("Sasuke Uchiha", "Leaf", 20, 80, LevelNinja.HOKAGE);
        Sasuke.battleStrategy();
        Sasuke.specialHability();

        Uchiha Madara = new Uchiha("Madara Uchiha", "Leaf", 20, 30, LevelNinja.HOKAGE);
        Madara.specialHability();
        Madara.battleStrategy();
    }
}
