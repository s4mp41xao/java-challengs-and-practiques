package nivelIntermediario.abstractClassAndInterfaces;

public class Main {
    public static void main(String[] args) {
        Uzumaki Naruto = new Uzumaki();
        Naruto.name = "Naruto Uzumaki";
        Naruto.age = 18;
        Naruto.showName();
        Naruto.showAge();

        Uchiha Sasuke = new Uchiha();
        Sasuke.showVillage();
    }
}
