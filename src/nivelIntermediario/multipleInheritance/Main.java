package nivelIntermediario.multipleInheritance;

public class Main {
    public static void main(String[] args) {

        Uchiha Sasuke = new Uchiha();
        Sasuke.name = "Sasuke Uchiha";
        Sasuke.village = "Leaf";
        Sasuke.age = 18;
        Sasuke.activatedSharingan();

        Hatake Kakashi = new Hatake();
        Kakashi.name = "Kakashi Hataque";
        Kakashi.village = "Leaf";
        Kakashi.age = 48;
        Kakashi.welcome();
        Kakashi.activatedSharingan();
        Kakashi.activatedAnbu();
    }
}
