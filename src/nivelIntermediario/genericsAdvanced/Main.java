package nivelIntermediario.genericsAdvanced;

public class Main {
    public static void main(String[] args) {
        BolsaNinja<Object> bolsaNinja = new BolsaNinja<>();
        bolsaNinja.adicionarFerramenta(new Kunai("Ferro"));
        bolsaNinja.adicionarFerramenta(new Shuriken(10));
        System.out.println("Itens na bolsa ninja: ");
        bolsaNinja.mostrarFerramenta();
    }
}
