package nivelIntermediario.construtoresPratica;

public class Hokages {
    String name;
    String village;
    int age;
    boolean aliveOrNot;
    int missions;
    double bankBalance;


    // noArgs Constructor
    public Hokages() {
    }

    //allArgs Constructor (with arguments)
    public Hokages(String name) {
        this.name = name;
    }

    public Hokages(int age) {
        this.age = age;
    }

    public Hokages(String name, int age, boolean aliveOrNot) {
        this.name = name;
        this.age = age;
        this.aliveOrNot = aliveOrNot;
    }

    public Hokages(String name, String village, int age, boolean aliveOrNot, int missions, double bankBalance) {
        this.name = name;
        this.village = village;
        this.age = age;
        this.aliveOrNot = aliveOrNot;
        this.missions = missions;
        this.bankBalance = bankBalance;
    }
}
