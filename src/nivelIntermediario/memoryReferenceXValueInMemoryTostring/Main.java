package nivelIntermediario.memoryReferenceXValueInMemoryTostring;

public class Main {
    public static void main(String[] args) {

        System.out.println("-----------Naruto-----------");
        Uzumaki Naruto = new Uzumaki("Naruto Uzumaki", "Leaf", 17, 25, LevelNinja.GENIN);
        System.out.println(Naruto);

        System.out.println("-----------Sasuke-----------");
        Uchiha Sasuke = new Uchiha("Sasuke Uchiha", "Leaf", 20, 80, LevelNinja.HOKAGE);
        System.out.println(Sasuke);
    }
}
