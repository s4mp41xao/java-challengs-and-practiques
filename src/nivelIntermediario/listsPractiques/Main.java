package nivelIntermediario.listsPractiques;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> lisfOfNinjas = new ArrayList<>();
        lisfOfNinjas.add("Naruto Uzumaki");
        lisfOfNinjas.add("Sasuke Uchiha");
        lisfOfNinjas.remove("Sasuke Uchiha");
        lisfOfNinjas.set(0, "Sakura Haruno");
        System.out.println(lisfOfNinjas);
        System.out.println(lisfOfNinjas.size());
    }
}