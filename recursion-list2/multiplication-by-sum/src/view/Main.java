package view;

import controller.MultiplicationSumController;

public class Main {
    public static void main(String[] args) {

        int a = 4;
        int b = 5;

        MultiplicationSumController mc = new MultiplicationSumController();

        int result = mc.multiplication(a, b);

        System.out.println(a + " X " + b + " = " + result);
    }
}