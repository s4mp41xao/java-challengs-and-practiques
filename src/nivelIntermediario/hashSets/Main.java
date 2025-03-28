package nivelIntermediario.hashSets;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        List<String> ninjas = new ArrayList<>();
        ninjas.add("Naruto Uzumaki");
        ninjas.add("Sasuke Uchiha");

        Set<String> ninjasSet = new HashSet<>();

        // convert the arrayList to HashSet
        ninjasSet.addAll(ninjas);

        // remove element from hashset, need to pass in string
        ninjasSet.remove("Sasuke Uchiha");
        System.out.println("ninjasSet = " + ninjasSet);
    }
}

