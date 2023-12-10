import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();

        stack.push("W");
        stack.push("L");
        stack.push("H");
        stack.push("B");
        stack.push("R");
        stack.push("G");
        stack.push("J");

        Stack<String> stackAux = new Stack<>();
        stackAux.push("K");
        stackAux.push("G");
        stackAux.push("M");
        stackAux.push("B");
        stackAux.push("L");

        while(!stack.empty()){
            if(stack.peek().equals("R") || stack.peek().equals("W")){
                System.out.print(stack.pop());
            } else {
                stack.pop();
            }
        }

        while (!stackAux.empty()){
            stack.push(stackAux.pop());
        }
        System.out.println("\n" + stack);
    }
}