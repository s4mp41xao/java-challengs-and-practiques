package desafios.desafio6;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static <T> void main(String[] args) {
        // resolvidos
        // TODO: iniciar um LinkedList com 7 ninjas
        // TODO: Listar todos os ninjas na lista
        // TODO: Atributos dos ninjas, name, age, village
        // TODO: Adicionar o ninja no inicio da lista
        // TODO: Remover o ninja no inicio da lista
        // TODO: Listar todos os ninjas na lista

        //fazer
        // TODO: E acessar o ninja por indice


        LinkedList<Ninjas> listOfNinjas = new LinkedList<>();
        listOfNinjas.add(new Ninjas("Naruto Uzumaki",20, "Leaf"));
        listOfNinjas.add(new Ninjas("Sasuke Uchiha", 22, "Leaf"));
        listOfNinjas.add(new Ninjas("Sakura Haruno", 17, "Konoha"));
        listOfNinjas.add(new Ninjas("Kakashi Hatake", 31, "Konoha"));
        listOfNinjas.add(new Ninjas("Gaara", 17, "Areia"));
        listOfNinjas.add(new Ninjas("Shikamaru Nara", 17, "Konoha"));
        listOfNinjas.add(new Ninjas("Temari", 18, "Areia"));
        System.out.println(listOfNinjas.toString());

        /*
        * remove and return the first ninja from the list
        * */
        System.out.println("Ninja: " + listOfNinjas.getFirst().getName() + " - Removed from list!");
        listOfNinjas.remove();

        System.out.println(listOfNinjas.toString());

        /*
        * adds a ninja first in the list and returns his name
        * */
        listOfNinjas.addFirst(new Ninjas("Naruto Uzumaki", 20, "Leaf"));
        System.out.println("Ninja: " + listOfNinjas.getFirst().getName() + " - added first in the list!");

        System.out.println(listOfNinjas.toString());


        /*
        * get the second ninja from the list and return his name
        * */
        System.out.println("The second ninja from the list is: "+ listOfNinjas.get(1).getName());

        System.out.println("============ ALL NINJAS ============");

        for (Ninjas ninja : listOfNinjas) {
            System.out.println(ninja);
        }

    }
}


