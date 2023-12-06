package view;

import controller.FibonacciController;

public class Main {
    public static void main(String[] args) {

        int position = 10;

        FibonacciController fc = new FibonacciController();

        System.out.println("The number in the position " + position
                            + " of Fibonacci sequence is: " + fc.fibonacci(position));

    }
}