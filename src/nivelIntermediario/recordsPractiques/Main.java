package nivelIntermediario.recordsPractiques;

public class Main {
    public static void main(String[] args) {

        Ninja naruto = new Ninja("Naruto Uzumaki", "naruto@email.com", 119999999);
        System.out.println("naruto = " + naruto);

        NinjaRecord sasuke = new NinjaRecord("Sasuke Uchiha", "sasuke@email.com", 119999998);
        System.out.println("sasuke = " + sasuke);
        System.out.println("Email do Sasuke em caixa alta: " + sasuke.emailCaixaAlta());
    }
}
