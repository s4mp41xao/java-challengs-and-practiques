package nivelIntermediario.linkedList;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> linkedlist = new LinkedList<>();
        linkedlist.add("Naruto Uzumaki");
        linkedlist.add("Sasuke Uchiha");
        linkedlist.add("Sakura Haruno");
        linkedlist.remove(0);
        linkedlist.add(0, "Naruto Uzumaki");
        System.out.println(linkedlist);
    }
}
