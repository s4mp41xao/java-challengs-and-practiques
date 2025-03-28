package nivelIntermediario.treeSets;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> ninjas = new ArrayList<>();
        ninjas.add("Naruto");
        ninjas.add("Sasuke");
        Set<String> ninjasTree = new TreeSet<>();
        ninjasTree.addAll(ninjas);
        System.out.println("ninjasTree = " + ninjasTree);

        Set<String> ninjasLinkedHashSet = new LinkedHashSet<>();
        ninjasLinkedHashSet.addAll(ninjas);
        System.out.println("ninjasLinkedHashSet = " + ninjasLinkedHashSet);
    }
}
