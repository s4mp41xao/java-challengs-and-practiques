package nivelIntermediario.heranca;

public class Main {
    public static void main(String[] args) {




        Ninja Naruto = new Ninja();
        Naruto.nome = "Naruto Uzumaki";
        Naruto.aldeia = "Aldeia da folha";
        Naruto.idade = 20;

        Uchiha Sasuke = new Uchiha();
        Sasuke.nome = "Sasuke Uchiha";
        Sasuke.aldeia = "Aldeia da folha";
        Sasuke.idade = 23;
        Sasuke.SharinganAtivado();


        System.out.println(Naruto.nome);
        System.out.println(Sasuke.nome);
    }
}
