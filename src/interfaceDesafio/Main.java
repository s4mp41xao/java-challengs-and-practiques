package interfaceDesafio;

public class Main {
    public static void main(String[] args) {

        Uchiha Sasuke = new Uchiha();
        Sasuke.nome = "Sasuke Uchiha";
        Sasuke.idade = 23;
        Sasuke.missao = "Derrotar a aldeia da folha";
        Sasuke.nivelDeDificuldade = "Fácil";
        Sasuke.statusDaMissao = "Em andamento";
        System.out.println(Sasuke.nome);

        Hyuga Hinata = new Hyuga();
        Hinata.nome = "Hinata Hyuga";
        Hinata.idade = 22;
        Hinata.AtivarByakugan();
        System.out.println(Hinata.nome);

        Uzumaki Naruto = new Uzumaki();
        Naruto.nome = "Naruto Uzumaki";
        Naruto.idade = 19;
        System.out.println(Naruto.nome);
        Naruto.AtivarClone();
    }
}
