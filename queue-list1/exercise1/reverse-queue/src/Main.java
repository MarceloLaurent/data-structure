import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();

        queue.add(61);
        queue.add(90);
        queue.add(73);
        queue.add(12);
        queue.add(39);
        queue.add(18);

        System.out.print("Before: " + queue);

        while (!queue.isEmpty()){
            stack.push(queue.remove());
        }

        while (!stack.isEmpty()){
            queue.add(stack.pop());
        }

        System.out.print("\nAfter: " + queue);
    }
}