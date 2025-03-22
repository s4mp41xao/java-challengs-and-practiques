package nivelIntermediario.construtoresPratica;

public class Main {
    public static void main(String[] args) {

        Hokages Hashirama = new Hokages();
        Hashirama.name = "Hashirama";

        // define args to constructor
        Hokages Tobirama = new Hokages("Tobirama Senju");
        System.out.println(Tobirama.name);

        Hokages Hiruzen = new Hokages(40);
        System.out.println(Hiruzen.age);

        Hokages Minato = new Hokages("Minato Namikaze", 20, false);
        System.out.println(Minato.name);
    }
}
