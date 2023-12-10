package controller;

import java.util.Stack;

public class PairOrOddController {

    public PairOrOddController() {
        super();
    }

    public void pairOrOdd(Stack<Integer> stackA){
        Stack<Integer> stackB = new Stack<>();
        Stack<Integer> stackAux = new Stack<>();

        while(!stackA.isEmpty()){
            if(stackA.peek() % 2 == 0){
                stackAux.push(stackA.pop());
            } else {
                stackB.push(stackA.pop());
            }
        }

        while(!stackAux.isEmpty()) {
            stackA.push(stackAux.pop());
        }
        System.out.print("StackA (pairs): ");
        System.out.println(stackA);
        System.out.print("StackB (odds): ");
        System.out.println(stackB);
    }
}
