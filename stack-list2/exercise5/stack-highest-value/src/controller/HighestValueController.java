package controller;

import java.util.Stack;

public class HighestValueController {

    public HighestValueController() {
        super();
    }

    public int highestValue(Stack<Integer> stack){
        int highestValue = stack.peek();
        int count = 0;

        while (!stack.isEmpty()) {
            if(count <= 2) {
                if(highestValue < stack.peek()) {
                    highestValue = stack.pop();
                } else {
                    stack.pop();
                }
                count++;
            } else {
                stack.push(highestValue);
                count = 0;
            }
        }

        return highestValue;
    }
}
