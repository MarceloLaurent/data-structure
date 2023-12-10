import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(17);
        stack.push(20);
        stack.push(22);
        stack.push(25);
        stack.push(11);
        stack.push(39);
        stack.push(5);
        stack.push(15);
        stack.push(38);
        stack.push(26);
        stack.push(14);

        System.out.print("Before: " + stack);

        Stack<Integer> stackAux1 = new Stack<>();
        Stack<Integer> stackAux2 = new Stack<>();

        while (!stack.empty()){
            stackAux1.push(stack.pop());
        }

        while (!stackAux1.empty()){
            stackAux2.push(stackAux1.pop());
        }

        while (!stackAux2.empty()){
            stack.push(stackAux2.pop());
        }

        System.out.print("\nAfter: " + stack);
    }
}