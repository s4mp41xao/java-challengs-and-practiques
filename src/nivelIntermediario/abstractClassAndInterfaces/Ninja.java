package nivelIntermediario.abstractClassAndInterfaces;

public abstract class Ninja {
    String name;
    int age;

    // Abstract method
    public abstract void showName();

    // Normal method
    public void showAge() {
        System.out.println("I have " + age + " years");
    }
}
