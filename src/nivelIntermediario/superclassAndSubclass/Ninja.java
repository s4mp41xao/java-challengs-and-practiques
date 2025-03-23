package nivelIntermediario.superclassAndSubclass;

public abstract class Ninja implements BattleStrategy {
    String name;
    String village;
    int age;

    public Ninja() {
    }

    public Ninja(String name, String village, int age) {
        this.name = name;
        this.village = village;
        this.age = age;
    }

    public void spell() {
        System.out.println("My name is: " + name + " and my spell is...");
    }

    @Override
    public void BattleStrategyNinja() {
        System.out.println("This is my battle strategy " + name);
    }
}
