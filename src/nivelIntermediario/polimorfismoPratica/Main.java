package nivelIntermediario.polimorfismoPratica;

public class Main {
    public static void main(String[] args) {

        Ninja Naruto = new Ninja();
        Naruto.name = "Naruto Uzumaki";
        Naruto.habilidadeEspecial();

        Uchiha Sasuke = new Uchiha();
        Sasuke.name = "Sasuke Uchiha";
        Sasuke.village = "Aldeia da folha";
        Sasuke.age = 18;
        Sasuke.habilidadeEspecial();

    }
}
