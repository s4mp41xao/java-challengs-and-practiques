package nivelIntermediario.multipleInheritance;

public class Uchiha extends Ninja implements SharinganInterface{

    // import method from SharinganInterface
    public void activatedSharingan() {
        System.out.println("My name is " + name + " and my Sharingan is actived.");
    }
}
