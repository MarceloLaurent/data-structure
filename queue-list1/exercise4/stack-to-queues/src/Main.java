import java.util.LinkedList;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        LinkedList<Integer> pairs = new LinkedList<>();
        LinkedList<Integer> odd = new LinkedList<>();

        stack.push(75);
        stack.push(315);
        stack.push(481);
        stack.push(200);
        stack.push(557);
        stack.push(74);
        stack.push(245);
        stack.push(222);
        stack.push(269);
        stack.push(82);
        stack.push(469);
        stack.push(448);
        stack.push(584);
        stack.push(163);
        stack.push(186);
        stack.push(539);
        stack.push(389);

        System.out.println(stack);

        while (!stack.isEmpty()){
            if (stack.peek() % 2 == 0){
                pairs.add(stack.pop());
            } else {
                odd.add(stack.pop());
            }
        }

        System.out.println("Pairs: " + pairs);
        System.out.println("Odd: " + odd);
    }
}