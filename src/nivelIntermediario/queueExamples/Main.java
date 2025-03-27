package nivelIntermediario.queueExamples;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<String> ninjasQueue = new LinkedList<>();
        ninjasQueue.add("Naruto Uzumaki");
        ninjasQueue.add("Sasuke Uchiha");
        ninjasQueue.add("Sakura Haruno");
        ninjasQueue.add("Shikamaru");
        System.out.println(ninjasQueue);

        // remove the first item from the queue (head)
        ninjasQueue.poll();
        System.out.println(ninjasQueue.peek());

        // verify if queue is empety
        if (ninjasQueue.isEmpty()) {
            System.out.println("The queue is empty");
        }

    }
}
