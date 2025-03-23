package nivelIntermediario.memoryReferenceXValueInMemoryTostring;

public abstract class Ninja {
    String name;
    String village;
    int age;
    int numberOfMissionsCompleted;
    LevelNinja rank;


    // TODO: Include two news attributes: numberOfMissionsCompleted and rank.

    public Ninja() {
    }

    public Ninja(String name, String village, int age) {
        this.name = name;
        this.village = village;
        this.age = age;
    }

    // TODO: Overload constructor calling all args
    public Ninja(String name, String village, int age, int numberOfMissionsCompleted, LevelNinja rank) {
        this(name, village, age);
        this.numberOfMissionsCompleted = numberOfMissionsCompleted;
        this.rank = rank;
    }

    public void specialHability() {
        System.out.println("My nam is " + name + " and this is my special attack");
    }

    public void battleStrategy() {
        System.out.println( "My name is : " + name + " and this is my battle strategy");
    }

    public void showInformation() {
        System.out.println("My name is: " + name);
        System.out.println("My village is: " + village);
        System.out.println("My age is: " + age);
        System.out.println("My missins completed is: " + numberOfMissionsCompleted);
        System.out.println("My rank is: " + rank);
    }

    @Override
    public String toString() {
        return "My name is: " + name;
    }
}
