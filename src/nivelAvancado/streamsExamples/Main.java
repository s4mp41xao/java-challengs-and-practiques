package nivelAvancado.streamsExamples;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Ninja> ninjas = new ArrayList<>();
        ninjas.add(new Ninja("Naruto Uzumaki", "Konoha", 17));
        ninjas.add(new Ninja("Sasuke Uchiha", "Konoha", 17));
        ninjas.add(new Ninja("Sakura Haruno", "Konoha", 17));
        ninjas.add(new Ninja("Kakashi Hatake", "Konoha", 30));
        ninjas.add(new Ninja("Gaara", "Suna", 18));
        ninjas.add(new Ninja("Temari", "Suna", 19));
        ninjas.add(new Ninja("Rock Lee", "Konoha", 17));

        System.out.println("============= FILTER BY VILLAGE KONOHA =============");
        ninjas.stream()
                .filter(ninja -> ninja.getAldeia().equals("Konoha"))
                .forEach(System.out::println); //soutc
        //.stream

        System.out.println("============= FILTER BY AGE CRESCEND =============");

        ninjas.stream()
                .sorted((n1, n2) -> Integer.compare(n1.getIdade(), n2.getIdade()))
                .forEach(System.out::println);

        System.out.println("============= FILTER BY NAME =============");
        ninjas.stream().sorted((n1, n2) -> String.copyValueOf(n1.getNome(), n2.getNome()))
                .forEach(System.out::println);
    }
}
