package desafios.desafio3;

public class Ninja {
    String nome;
    String nivelDeDificuldade;
    String statusDaMissao;
    String missao;
    int idade;

    public void mostrarInformacoes(){
        System.out.println("Nome = " + nome);
        System.out.println("Nivel de dificuldade = " + nivelDeDificuldade);
        System.out.println("Status da Missão = " + statusDaMissao);
        System.out.println("Missão = " + missao);
        System.out.println("Idade = " + idade);
    }
}
