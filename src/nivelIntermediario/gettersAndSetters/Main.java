package nivelIntermediario.gettersAndSetters;

public class Main {
    public static void main(String[] args) {

        System.out.println("--------------- Naruto Uzumaki ---------------");
        Uzumaki Naruto = new Uzumaki("Naruto", "Aldeia da folha", 17, 50, 1.70);
        System.out.println("Nome: " + Naruto.getNome());
        Naruto.setNome("Naruto Uzumaki");
        System.out.println("Sobrenome adicionado");
        System.out.println("O nome completo agora é: " + Naruto.getNome());
    }
}
