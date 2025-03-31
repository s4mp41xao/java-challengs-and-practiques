package nivelIntermediario.bigO;

import java.util.ArrayList;
import java.util.LinkedList;

public class bigOnotations {
    public static void main(String[] args) {

        long inicio;
        long fim;
        long tempo;

        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        for (int i = 0; i < 100; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }

        inicio = System.nanoTime();
        arrayList.get(50);
        fim = System.nanoTime();
        tempo = fim - inicio;
        System.out.println("tempo = " + tempo);

        inicio = System.nanoTime();
        linkedList.get(50);
        fim = System.nanoTime();
        tempo = fim - inicio;
        System.out.println("tempo = " + tempo);

    }
}
