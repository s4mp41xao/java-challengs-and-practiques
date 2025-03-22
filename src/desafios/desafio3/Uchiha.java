package desafios.desafio3;

public class Uchiha extends Ninja {

    String habilidadeEspecial;

    public void mostrarHabilidadeEspecial() {
        System.out.println("Habilidade Especial = " + habilidadeEspecial);
    }


    public void mostrarInformacoes(){
        System.out.println("Nome = " + nome);
        System.out.println("Nivel de dificuldade = " + nivelDeDificuldade);
        System.out.println("Status da Missão = " + statusDaMissao);
        System.out.println("Missão = " + missao);
        System.out.println("Idade = " + idade);
        System.out.println("Habilidade especial uchiha");
    }

}