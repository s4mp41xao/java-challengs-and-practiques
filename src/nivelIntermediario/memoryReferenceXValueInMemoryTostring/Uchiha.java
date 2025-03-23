package nivelIntermediario.memoryReferenceXValueInMemoryTostring;

public class Uchiha extends Ninja{

    public Uchiha() {
        super();
    }

    public Uchiha(String name, String village, int age) {
        super(name, village, age);
    }

    public Uchiha(String name, String village, int age, int numberOfMissionsCompleted, LevelNinja rank) {
        super(name, village, age, numberOfMissionsCompleted, rank);
    }

    @Override
    public void specialHability() {
        System.out.println("My nam is " + name + " and this is my Uchiha attack and my number of missions is " + numberOfMissionsCompleted);
    }

}
