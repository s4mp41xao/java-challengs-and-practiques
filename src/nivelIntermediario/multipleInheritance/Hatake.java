package nivelIntermediario.multipleInheritance;

public class Hatake extends Ninja implements SharinganInterface, AnbuInterface, HokageInterface{
    public void welcome() {
        System.out.println(name + " Welcome Hatake");
    }

    public void activatedHokage() {
        System.out.println("Hokage Activated");
    }

    // import method from SharinganInterface
    public void activatedSharingan() {
        System.out.println("My name is " + name + " and my Sharingan is actived.");
    }

    public void activatedAnbu() {
        System.out.println("My name is " + name + " and my Anbu is actived.");
    }
}


