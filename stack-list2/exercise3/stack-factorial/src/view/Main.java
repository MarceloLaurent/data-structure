package view;

import controller.FactorialController;

public class Main {
    public static void main(String[] args) throws Exception {

        int value = 10;

        FactorialController fc = new FactorialController();

        System.out.println(value + "! = " + fc.factorial(value));
    }
}