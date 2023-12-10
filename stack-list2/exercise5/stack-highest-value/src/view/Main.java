package view;

import controller.HighestValueController;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        Stack<Integer> stack= new Stack<>();

        stack.push(1);
        stack.push(17);
        stack.push(20);
        stack.push(22);
        stack.push(25);
        stack.push(11);
        stack.push(3);
        stack.push(5);
        stack.push(15);
        stack.push(38);
        stack.push(26);
        stack.push(14);

        HighestValueController hc = new HighestValueController();

        System.out.println("Highest value: " + hc.highestValue(stack));
    }
}