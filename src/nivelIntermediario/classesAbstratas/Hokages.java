package nivelIntermediario.classesAbstratas;

public abstract class Hokages {
    String name;
    String village;
    boolean aliveOrNot;
    int age;
    int missions;
    double bankBalance;
    double height;

    // declare the abstract method
    public abstract void spell();

    public Hokages() {
    }

    public Hokages(String name, String village, boolean aliveOrNot, int age, int missions, double bankBalance, double height) {
        this.name = name;
        this.village = village;
        this.aliveOrNot = aliveOrNot;
        this.age = age;
        this.missions = missions;
        this.bankBalance = bankBalance;
        this.height = height;
    }
}
