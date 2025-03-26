package nivelIntermediario.genericsAdvanced;

import java.util.ArrayList;
import java.util.List;

public class BolsaNinja<T> {

    // inicializa o array
    private List<T> ferramentas;

    public BolsaNinja() {
        this.ferramentas = new ArrayList<>();
    }

    // coloca ferramentas no array
    public void adicionarFerramenta(T ferramenta) {
        ferramentas.add(ferramenta);
    }

    // mostrar ferramentas
    public void mostrarFerramenta() {
        for (T ferramenta : ferramentas) {
            System.out.println(ferramentas);
        }
    }
}
