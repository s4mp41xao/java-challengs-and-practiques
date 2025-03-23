package nivelIntermediario.polimorfismAndAbstraction;

public abstract class Ninja implements BattleStrategy{
    String name;
    int village;
    int age;

    public void spell() {
        System.out.println("My name is: " + name + " and my spell is...");
    }

    // define the body of method from BattleStrategy interface with polymorphism
    @Override
    public void battleStrategyNinja() {
        System.out.println("This is my battle strategy " + name);
    }
}



