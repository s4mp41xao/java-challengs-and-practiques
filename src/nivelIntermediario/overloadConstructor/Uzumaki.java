package nivelIntermediario.overloadConstructor;

public class Uzumaki extends Ninja{

    public Uzumaki() {
    }

    public Uzumaki(String name, String village, int age) {
        super(name, village, age);
    }

    public Uzumaki(String name, String village, int age, int numberOfMissionsCompleted, LevelNinja rank) {
        super(name, village, age, numberOfMissionsCompleted, rank);
    }

    public void activatedUzumaki(){
        System.out.println("My name is: " + name + " and this is my attack Uzumaki");
    }

}
