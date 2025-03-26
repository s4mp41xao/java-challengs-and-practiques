package nivelIntermediario.stackExamples;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<String> ninjaStack = new Stack<>();
        // push turn the last item to first on the stack
        ninjaStack.push("Naruto Uzumaki");
        ninjaStack.push("Sasuke Uchiha");
        ninjaStack.push("Sakura Haruno");

        // remove the first item on stack
        ninjaStack.pop();

        // show de last item on stack
        System.out.println(ninjaStack.peek());

        // verify the size of stack
        System.out.println("Stack Size: " + ninjaStack.size());

        // show itens on stack
        System.out.println(ninjaStack);
    }
}
